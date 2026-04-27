package com.rizvi.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithCustomLogic {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ABC25", "DEF10", "GHI88", "XYZ14");
        
        List<String> sorted = strings.stream()
            .collect(Collectors.toList())
            .stream()
            .sorted((a, b) -> {
                int numA = Integer.parseInt(a.replaceAll("[^0-9]", ""));
                int numB = Integer.parseInt(b.replaceAll("[^0-9]", ""));
                return Integer.compare(numA, numB);
            })
            .collect(Collectors.toList());
        
        System.out.println("Sorted list: " + sorted);
    }
}