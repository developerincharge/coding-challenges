package com.rizvi.stream;

import java.util.*;

class ArrayMapperFrequency {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5};
        
        // Create Map with Integer key and Integer value (frequency)
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Initialize map with keys from arr1
        for (int key : arr1) {
            frequencyMap.put(key, 0);
        }
        
        // Count occurrences of keys in arr2
        for (int value : arr2) {
            if (frequencyMap.containsKey(value)) {
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            }
        }
        
        // Print the frequency result
        System.out.println("Key -> Frequency mapping:");
        System.out.println("=========================");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Key " + entry.getKey() + " appears " + entry.getValue() + " time(s)");
        }
        
        // Also show the actual values
        System.out.println("\nKey -> Values mapping:");
        System.out.println("=========================");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            System.out.print("Key " + key + " -> ");
            for (int i = 0; i < count; i++) {
                  System.out.print(key);
                if (i < count - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}