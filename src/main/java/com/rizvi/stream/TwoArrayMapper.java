package com.rizvi.stream;

import java.util.*;

class TwoArrayMapper {
    
    public static Map<Integer, List<Integer>> mapArrays(int[] keys, int[] values) {
        Map<Integer, List<Integer>> result = new HashMap<>();
        
        // Initialize map with keys
        for (int key : keys) {
            result.put(key, new ArrayList<>());
        }
        
        // Add values that match keys
        for (int value : values) {
            if (result.containsKey(value)) {
                result.get(value).add(value);
            }
        }
        
        return result;
    }
    
    public static void printMapping(Map<Integer, List<Integer>> map) {
        System.out.println("Key -> Value Mapping:");
        System.out.println("=".repeat(30));
        
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5};
        
        // Get the mapping
        Map<Integer, List<Integer>> mapping = mapArrays(arr1, arr2);
        
        // Print the result
        printMapping(mapping);
        
        // Additional information
        System.out.println("\n" + "=".repeat(30));
        System.out.println("Summary:");
        System.out.println("Keys from arr1: " + Arrays.toString(arr1));
        System.out.println("Values from arr2: " + Arrays.toString(arr2));
        System.out.println("Total elements mapped: " + 
            mapping.values().stream().mapToInt(List::size).sum());
    }
}