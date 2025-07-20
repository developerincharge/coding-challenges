package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConvertListToUpperDemo {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "papaya","hyacinth","cherry", "date","guava", "fig", "elderberry", "jackfruit", "lemon", "pineapple","kiwi","strawberry", "banana", "date","fig");

        fruits.stream()
                .map(str -> str.toUpperCase())
                .sorted()
                .forEach(str -> System.out.println(str));

        System.out.println("###################################");

        fruits.stream()
                .filter(str -> str.length() > 5)
                .forEach(str -> System.out.println(str));

        System.out.println("##################################");

          fruits.stream().distinct().forEach(str -> System.out.println(str));

        System.out.println("##################################");

        fruits.stream().limit(5).forEach(str -> System.out.println(str));

        System.out.println("##################################");

        fruits.stream()
                .filter(str -> str.contains("e"))
                .forEach(str -> System.out.println(str));

        System.out.println("##################################");

        fruits.stream()
                .filter(str -> !str.startsWith("d"))
                .forEach(str -> System.out.println(str));

        System.out.println("##################################");

        // Find first fruit starting with 'z' (case-insensitive)
        String result = fruits.stream()
                .filter(s -> s.toLowerCase().startsWith("z"))
                .findFirst()
                .orElse("Not found");

        System.out.println("First fruit  : " + result);


        System.out.println("#################################");

        Optional<String> firstFruit = fruits.stream()
                .filter(s -> s.startsWith("k"))
                .findFirst();

        if(!firstFruit.isPresent()) {
            System.out.println("Not found");
        } else {
            System.out.println("First fruit  :  " + firstFruit.get());
        }
        firstFruit.ifPresent(str -> System.out.println(str));


        System.out.println("###################################");

        fruits.stream()
                .filter(str -> str.startsWith("a"))
                .findFirst()
                .ifPresent(str -> System.out.println(str));


        System.out.println("###################################");

        // Find and print first fruit starting with 'z'
        fruits.stream()
                .filter(s -> s.toLowerCase().startsWith("s"))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Not found")
                );

    }
}
