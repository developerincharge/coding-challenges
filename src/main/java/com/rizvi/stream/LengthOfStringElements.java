package com.rizvi.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LengthOfStringElements {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "sky","strawberrys","papaya", "myth","hyacinth","cherry", "try","date","guava", "fig", "elderberry", "jack fruit", "cry", "lemon", "pineapple","kiwi","strawberry", "banana", "date","fig");


        // length of string elements
        //fruits.stream().map(String::length).forEach(System.out::println);

        fruits.forEach((fruit) -> {
            System.out.println(fruit + " -> " + fruit.length());
        });

//        for (String fruit : fruits) {
//            System.out.println(fruit + " -> " + fruit.length());
//        }

        // sorted by length of each element
        System.out.println("#######################");
        fruits.stream()
                .distinct()
                .sorted((o1,o2) -> o1.length() - o2.length())
                .forEach(System.out::println);

        System.out.println("#########################");
        // sorted by length of each element in reversed order
        fruits.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

        System.out.println("##########################");
        // sort by max length of element present in the list
        fruits.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        System.out.println("#######################");
       // print only elements which contains vowels "aeiou"
        fruits.stream()
                .filter(str -> str.matches(".*[aeiou].*"))
                .forEach(System.out::println);


        System.out.println("#######################");
      // print the list of elements in comma separated
          String fruitList =  fruits.stream()
                   .collect(Collectors.joining(","));
          System.out.println(fruitList);

        System.out.println("#######################");
  // print the elements in reverse word order
        fruits.stream()
                .map(str -> new StringBuilder(str).reverse())
                .forEach(System.out::println);

        System.out.println("#########################");
        //  sort the elements based on first character
        Map<Character, List<String>> firstCharMap =  fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        firstCharMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("#########################");
       //  sort the elements based on last character
        Map<Character, List<String>> lastCharMap =  fruits.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(str.length() -1)));
        lastCharMap.forEach((k, v) -> System.out.println(k + " -> " + v));


        System.out.println("#########################");
       // group the elements based on length
        Map<Integer, List<String>> lengthMap =  fruits.stream().distinct()
                .collect(Collectors.groupingBy(String::length));
        lengthMap.forEach((k, v) -> System.out.println(k + " -> " + v));


        System.out.println("#########################");
  // sort the elements based on Vowels and Non-Vowels as true ? false ?
        Predicate<String> pred = str -> str.matches(".*[aeiou].*");
        Map<Boolean, List<String>> predMap =  fruits.stream()
                .collect(Collectors.partitioningBy(pred));
        System.out.println("With Vowels  : " + predMap.get(true));
        System.out.println("Without Vowels  : " + predMap.get(false));
        predMap.forEach((k, v) -> System.out.println(k + " -> " + v));


        System.out.println("################################");
        // sort an element which length is greater than 10
                       String val = fruits.stream()
                .filter(str -> str.length() > 10)
                  .findAny()
                  .orElseThrow(() -> new NoSuchElementException("No Value found"));
        System.out.println(val);


        System.out.println("#####################################");
      // Reverse the list of strings using IntStream API
        Stream<String> intStream = IntStream.range(0, fruits.size())
                .mapToObj(i -> fruits.get(fruits.size() -1-i))
                .distinct();
                //.mapToInt(String::length);
        intStream.forEach(System.out::println);


    }
}
