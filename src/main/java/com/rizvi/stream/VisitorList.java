package com.rizvi.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Person(String firstName, String lastName, int age) {
    private static final String[] firsts = {"Able", "Bob", "Charlie", "Donna", "Eve", "Fred"};
    private static final String[] lasts = {"Norton", "OHara", "Peterson", "Quincy", "Richardson", "Smith"};
    private static final Random random = new Random();

    public Person() {
        this(firsts[random.nextInt(firsts.length)],
             lasts[random.nextInt(lasts.length)],
             random.nextInt(100 - 18 + 1) + 18); // Fixed: Generate age from 18 to 100
    }

    @Override
    public String toString() {
        return "%s, %s (%d)".formatted(lastName, firstName, age);
    }
}

public class VisitorList {
    private static final CopyOnWriteArrayList<Person> masterList;

    static {
        masterList = Stream.generate(Person::new)
                .distinct()
                .limit(2500)
                .collect(Collectors.toCollection(CopyOnWriteArrayList::new));
    }

    private static final ArrayBlockingQueue<Person> newVisitors = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        ScheduledExecutorService producerExecutor = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService consumerPool = Executors.newScheduledThreadPool(3);

        Runnable producer = () -> {
            Person visitor = new Person();
            System.out.println("Queueing " + visitor);
            boolean queued;
            try {
                queued = newVisitors.offer(visitor, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                System.err.println("Producer interrupted: " + e.getMessage());
                return;
            }
            if (queued) {
                System.out.println("Queue New Visitor: " + newVisitors);
            } else {
                System.out.println("Queue is Full, cannot add " + visitor);
                System.out.println("Draining queue and writing data to file");
                List<Person> tempList = new ArrayList<>();
                newVisitors.drainTo(tempList);
                List<String> lines = tempList.stream()
                        .map(Person::toString)
                        .collect(Collectors.toList());
                lines.add(visitor.toString());
                try {
                    Files.write(Path.of("DrainedQueue.txt"), lines,
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.err.println("Failed to write to file: " + e.getMessage());
                }
                // Shutdown producer when queue is full
                producerExecutor.shutdown();
            }
        };

        Runnable consumer = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Polling queue, size: " + newVisitors.size());
            Person visitor = newVisitors.poll();
            if (visitor != null) {
                System.out.println(threadName + " visited " + visitor);
                if (!masterList.contains(visitor)) {
                    masterList.add(visitor);
                    System.out.println("---> New Visitor gets Coupon! : " + visitor);
                }
            }
            System.out.println(threadName + " Done Polling queue: " + newVisitors.size());
        };

        // Schedule producer and consumer tasks
        producerExecutor.scheduleWithFixedDelay(producer, 0, 1, TimeUnit.SECONDS);
        for (int i = 0; i < 3; i++) {
            consumerPool.scheduleAtFixedRate(consumer, 6, 3, TimeUnit.SECONDS);
        }

        // Wait for producer to terminate (when queue is full)
        try {
            producerExecutor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted (producer): " + e.getMessage());
            producerExecutor.shutdownNow();
        }

        // Shutdown consumers after producer is done
        consumerPool.shutdown();
        try {
            // Wait for consumers to process remaining items
            if (!consumerPool.awaitTermination(10, TimeUnit.SECONDS)) {
                consumerPool.shutdownNow();
                System.out.println("Consumer pool forcibly shut down");
            }
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted (consumer): " + e.getMessage());
            consumerPool.shutdownNow();
        }

        System.out.println("Program terminated. Final queue state: " + newVisitors);
        System.out.println("Final masterList size: " + masterList.size());
    }
}