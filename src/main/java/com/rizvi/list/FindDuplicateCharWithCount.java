package com.rizvi.list;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharWithCount {
    public static void main(String[] args) {

        String input = "a quick brown fox and java Stream zzz";
        // Convert string to char array
//        Map<Character, Long> duplicates = input.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> !Character.isWhitespace(c))
//                .collect(
//                        HashMap::new,
//                        (map, c) -> map.put(c, map.getOrDefault(c, 0L) + 1),
//                        HashMap::putAll
//                );
//        // Filter and print duplicates with their counts
//        duplicates.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .forEach(entry -> System.out.println("Character: '" +
//                entry.getKey() + "' - Count: " +
//                entry.getValue()));

        Map<Character, Long> duplicateChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        duplicateChar.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()==' ' ? "space : " + entry.getValue() : entry.getKey() +"  Character Count is : " + entry.getValue()));

        System.out.println("===========================");
        String output = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey() + "" + entry.getValue())
                .collect(Collectors.joining());
        System.out.println(output);
    }
}
