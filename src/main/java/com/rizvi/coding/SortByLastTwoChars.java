package com.rizvi.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLastTwoChars {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ABC25", "DEF10", "GHI88", "XYZ14");
        
        // Sort using streams based on the last two characters as integers
        List<String> sorted = strings.stream()
            .sorted((s1, s2) -> {
                // Extract last two characters and convert to integer
                int num1 = Integer.parseInt(s1.substring(s1.length() - 2));
                int num2 = Integer.parseInt(s2.substring(s2.length() - 2));
                return Integer.compare(num1, num2);
            })
            .collect(Collectors.toList());
        
        System.out.println("Original list: " + strings);
        System.out.println("Sorted list: " + sorted);
    }
}