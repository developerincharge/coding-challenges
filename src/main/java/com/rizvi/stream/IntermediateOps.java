package com.rizvi.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations are lazy in nature
        // They are not executed until a terminal operation is invoked
        // Example of intermediate operations: filter, map, sorted, distinct, etc.

        // Terminal operations trigger the processing of the stream
        // Example of terminal operations: forEach, collect, count, reduce, etc.

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count = numbers.stream()
                .filter(n -> n % 2 == 0) // Intermediate operation
                .map(n -> n * n)         // Intermediate operation
                .count();
        // Terminal operation
        System.out.println("Count of even squares: " + count);

        List<String> list = Arrays.asList("Assad", "Rizvi", "Ahsan","Mohammad", "Zainab", "Sabur", "Ahsan");
         // Intermediate operation,(lazy evaluation)(filter)
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // Intermediate operation (map)
        Stream<String> stringStream = filteredStream.map(String::toUpperCase);
        System.out.println("Filtered and Uppercase Names: " + stringStream.toList());

        // Intermediate operation (sorted)
        List<String> sortedList = list.stream()
                .sorted() // Intermediate operation
                .toList(); // Terminal operation
        System.out.println("Sorted Names: " + sortedList);

        Stream<String> sortedStream = list.stream()
                .sorted(Comparator.comparingInt(String::length)); // Intermediate operation
        // Terminal operation
        System.out.println("Sorted Names: " + Arrays.toString(sortedStream.toArray()));

        // Demonstrating that intermediate operations are lazy
        // Intermediate operation (distinct)
        Stream<String> distinctStream = list.stream().distinct();
        // No terminal operation invoked yet, so no processing done
        System.out.println("Distinct operation "+ distinctStream.toList());

         // Intermediate operation (limit)
        Stream<String> limitedStream = list.stream().limit(3);
        // Terminal operation
        System.out.println("Limited Names: " + limitedStream.toList());
    // Demonstrating infinite streams and limit with intermediate operations
        Stream.iterate(1, n -> n + 1).limit(25).forEach(System.out::println);
    // infinite stream with skip and limit

        Stream.iterate(1, n -> n + 1).skip(5).limit(25).forEach(System.out::println);


    }
}
