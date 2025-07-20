package com.rizvi.integers;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

    public static void main(String[] args) {

        // java 8 Stream API

        int[] numbers = {1, 2, 3, 4, 3, 5, 2, 3, 4, 6, 7, 8, 5, 5, 9};

        Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(element -> System.out.println("Most repeated element is : " + element));


    }
}
