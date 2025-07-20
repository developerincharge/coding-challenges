package com.rizvi.stream;

import java.util.Arrays;
import java.util.List;

public class LengthOfStringElements {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "papaya","hyacinth","cherry", "date","guava", "fig", "elderberry", "jackfruit", "lemon", "pineapple","kiwi","strawberry", "banana", "date","fig");

        //fruits.stream().map(String::length).forEach(System.out::println);

        fruits.forEach((fruit) -> {
            System.out.println(fruit + " -> " + fruit.length());
        });

//        for (String fruit : fruits) {
//            System.out.println(fruit + " -> " + fruit.length());
//        }
    }
}
