package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementFromString {

    public static void main(String[] args) {

           String str = "gainjavalnowledge";

            List<String> collect = Arrays.stream(str.split(""))
                             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                             .entrySet().stream().filter(ele -> ele.getValue() > 1)
                             .map(Map.Entry::getKey)
                             .toList();

                System.out.println("all duplicate characters are : " + collect);


             List<String> fruits  = Arrays.asList("Apple", "Mango", "Banana", "Apple", "Kiwi", "Mango", "Mango");

                 List<String> distinctFruits =  fruits.stream()
                         .distinct()
                         .collect(Collectors.toList());
                 System.out.println(distinctFruits);

                 fruits.stream().map(String::toUpperCase).forEach(System.out::println);

                 long count = fruits.stream().filter(f -> f.startsWith("M")).count();
                 System.out.println("Count of Mango : " + count);


    }
}
