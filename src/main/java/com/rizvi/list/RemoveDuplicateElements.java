package com.rizvi.list;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        // Remove duplicate elements from a integer list

        List<Integer>  numbers = Arrays.asList(1,2,2,3,4,4,5,6,7,6);

        List<Integer> list = numbers.stream()
                .distinct()
                .toList();
        System.out.println(list);



        // given list of string word and remove duplicate words from it

        List<String> fruits = Arrays.asList("apple","kiwi", "banana", "papaya","elderberry","cherry", "date","guava", "banana", "elderberry", "jackfruit", "lemon", "pineapple","kiwi","strawberry", "banana", "date","fig");

        List<String> distinctFruits =  fruits.stream()
                           .distinct()
                           .toList();
             System.out.println(distinctFruits);
    }
}
