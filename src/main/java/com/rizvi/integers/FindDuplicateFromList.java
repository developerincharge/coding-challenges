package com.rizvi.integers;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateFromList {

    public static void main(String[] args) {
        // List of Integers: List(1, 2, 3, 4, 9, 5, 3, 6, 3, 7, 8, 2, 9);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 9, 5, 3, 6, 3, 7, 8, 2, 9);
        // To find the duplicates using stream api
      //  List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 9, 5, 3, 6, 3, 7, 8, 2, 9));

        numbers.sort(Comparator.naturalOrder());
          // List after sorting : [1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 9]
        System.out.println("Sort the List of numbers: " + numbers);
        System.out.println("=================================================================");
           // List after removing duplicates : [1, 2, 3, 4, 5, 6, 7, 8, 9]
        List<Number> sortedList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed duplicates using stream api:  "+ sortedList);
        System.out.println("=================================================================");
           // Find duplicate numbers in the original list : [2, 3, 9]
          Set<Integer> duplicateNumbers = numbers.stream().collect(Collectors
                  .groupingBy(n -> n, Collectors.counting()))
                  .entrySet().stream()
                  .filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
        System.out.println("Find duplicate numbers in the original list: "+ duplicateNumbers);

          // Find duplicate numbers using Set
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }
        System.out.println("Find duplicate numbers using Set: " + duplicates);
    }
}
