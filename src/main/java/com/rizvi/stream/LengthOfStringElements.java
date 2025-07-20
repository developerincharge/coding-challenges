package com.rizvi.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfStringElements {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "strawberry","papaya","hyacinth","cherry", "date","guava", "fig", "elderberry", "jackfruit", "lemon", "pineapple","kiwi","strawberry", "banana", "date","fig");

        //fruits.stream().map(String::length).forEach(System.out::println);

        fruits.forEach((fruit) -> {
            System.out.println(fruit + " -> " + fruit.length());
        });

//        for (String fruit : fruits) {
//            System.out.println(fruit + " -> " + fruit.length());
//        }

        System.out.println("#######################");
        fruits.stream()
                .distinct()
                .sorted((o1,o2) -> o1.length() - o2.length())
                .forEach(System.out::println);

        System.out.println("#########################");

        fruits.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

        System.out.println("##########################");

        fruits.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        System.out.println("#######################");

        fruits.stream()
                .filter(str -> str.matches(".*[aeiou].*"))
                .forEach(System.out::println);


        System.out.println("#######################");

          String fruitList =  fruits.stream()
                   .collect(Collectors.joining(","));
          System.out.println(fruitList);

        System.out.println("#######################");

        fruits.stream()
                .map(str -> new StringBuilder(str).reverse())
                .forEach(System.out::println);

        System.out.println("#########################");

        Map<Character, List<String>> firstCharMap =  fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        firstCharMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("#########################");

        Map<Character, List<String>> lastCharMap =  fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(str.length() -1)));
        lastCharMap.forEach((k, v) -> System.out.println(k + " -> " + v));



        System.out.println("#########################");

        Map<Integer, List<String>> lengthMap =  fruits.stream().distinct()
                .collect(Collectors.groupingBy(String::length));
        lengthMap.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
}
