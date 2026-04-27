package com.rizvi.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortByLastTwoCharsCompact {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ABC25", "DEF10", "GHI88", "XYZ14");
        
        // Using Comparator.comparing with a key extractor
        List<String> sorted = strings.stream()
            .sorted(Comparator.comparing(s -> Integer.parseInt(s.substring(s.length() - 2))))
            .toList();
        
        System.out.println("Original list: " + strings);
        System.out.println("Sorted list: " + sorted);
    }
}