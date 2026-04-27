package com.rizvi.list;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEachOccurenceFroString {

    public static void main(String[] args) {
        String s = "abcabcde";
        String output = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey() + "" + entry.getValue())
                .collect(Collectors.joining());
        System.out.println(output);

    }
}
