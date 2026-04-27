package com.rizvi.stream;

import java.util.*;
import java.util.stream.Collectors;

class ArrayMapperStreams {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5};
        
        // Convert arr1 to Set
        Set<Integer> keys = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        
        // Group arr2 elements that are in keys
        Map<Integer, List<Integer>> map = Arrays.stream(arr2)
            .boxed()
            .filter(keys::contains)
            .collect(Collectors.groupingBy(num -> num));
        
        // Print the result
        System.out.println("Using Java Streams:");
        System.out.println("=========================");
        map.forEach((key, value) -> System.out.println("Key " + key + " -> " + value));
        
        // Ensure all keys from arr1 are present (even if empty)
        for (int key : arr1) {
            map.putIfAbsent(key, new ArrayList<>());
        }
        
        System.out.println("\nWith all keys from arr1 (including empty ones):");
        System.out.println("=========================");
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Key " + entry.getKey() + " -> " + entry.getValue()));
    }
}