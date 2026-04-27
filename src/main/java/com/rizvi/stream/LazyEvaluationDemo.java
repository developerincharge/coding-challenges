package com.rizvi.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {

        // stateful and stateless operations
        System.out.println("Lazy Evaluation Demo");

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });
        System.out.println("Stream created,but no operations Before terminal.");
        // Terminal operation
        List<String> collected = stream.collect(Collectors.toList());

        System.out.println("After terminal operation:");
        System.out.println(collected);

    }
}
