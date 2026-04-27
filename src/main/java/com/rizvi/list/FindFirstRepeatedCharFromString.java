package com.rizvi.list;

import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharFromString {

    public static void main(String[] args) {

        String s = "java Stream API is very good concept";
       Character key = s.chars().mapToObj(c -> (char) c)
               .filter(c -> c != ' ')
                .collect(Collectors
                        .groupingBy(c -> c, Collectors
                                .counting())).entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("First Repeated Character is: " + key);

    }
}