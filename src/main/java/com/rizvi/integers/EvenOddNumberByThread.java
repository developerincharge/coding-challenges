package com.rizvi.integers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddNumberByThread {

    private static volatile boolean isOddTurn = true;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
         Runnable printOddNumbers = () -> {
             for (int i = 1; i <= 20; i=i+2) {
                 synchronized (EvenOddNumberByThread.class) {
                     while (!isOddTurn) {
                         try {
                             EvenOddNumberByThread.class.wait();
                         } catch (InterruptedException e) {
                             Thread.currentThread().interrupt();
                         }
                     }
                     System.out.println("Odd Number: " + i +" - Printed by Thread: " + Thread.currentThread().getName());
                     isOddTurn = false;
                     EvenOddNumberByThread.class.notifyAll();
                 }
             }
         };

        Runnable printEvenNumbers = () -> {
            for (int i = 2; i <= 20; i=i+2) {
                synchronized (EvenOddNumberByThread.class) {
                    while (isOddTurn) {
                        try {
                            EvenOddNumberByThread.class.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Even Number: " + i +" - Printed by Thread: " + Thread.currentThread().getName());
                    isOddTurn = true;
                    EvenOddNumberByThread.class.notifyAll();
                }
            }
        };


        executorService.submit(printOddNumbers);
        executorService.submit(printEvenNumbers);

        executorService.shutdown();

    }
}
