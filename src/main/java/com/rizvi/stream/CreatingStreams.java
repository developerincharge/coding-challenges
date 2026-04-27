package com.rizvi.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // Different ways to create streams in Java
        // 1. From Arrays
        //  List<String> students = List.of("Alice", "Bob", "Charlie");



        // 2. From Collections
        // List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        // Stream<Integer> streamFromList = integerList.stream();

        // List<String> list = Arrays.asList("A", "B", "C");

        // Stream<String> streamFromCollection = list.stream();

        // 3. From String Array
        // String[] array = {"A", "B", "C"};
        // Stream<String> streamFromArray = Arrays.stream(new String[]{"A", "B", "C"});
        // Stream<String> streamFromArray = Arrays.stream(array);

        // 4. Using Stream.of()
        // Stream<String> streamOf = Stream.of("A", "B", "C");

        // 5. Using Stream.generate()
        // Stream<Double> generatedStream = Stream.generate(Math::random).limit(5);

        // 6. Using Stream.iterate()
        // Stream<Integer> iteratedStream = Stream.iterate(0, n -> n + 2).limit(5);

        // 7. Infinite Streams
        //Stream.generate(()-> "Hello").limit(5).forEach(System.out::println);

//        Stream.iterate(1, i -> i + 1)
//                .limit(25)
//                .forEach(System.out::println);

        // Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);
        // infiniteStream.limit(10).forEach(System.out::println);

        // 8. From Files (Java NIO)
//         Path path = Paths.get("C:\\Users\\SYED RIZWI\\OneDrive\\Documents\\untitled.txt");
//         try (Stream<String> lines = Files.lines(path)) {
//             lines.forEach(System.out::println);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

        // Note: Uncomment the above lines to see how each method works.
    }
}
