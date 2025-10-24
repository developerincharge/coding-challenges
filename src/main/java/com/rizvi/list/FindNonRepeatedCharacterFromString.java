package com.rizvi.list;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacterFromString {

    public static void main(String[] args) {

        String str = "gainjavalnowledgeofstreamsapi";

//        char[] chars = str.toCharArray();
//        for (char ch : chars) {
//            int count = 0;
//            for (char ch1 : chars) {
//                if (ch == ch1) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println("First Non repeated character is : " + ch);
//            }
//        }
//
//        System.out.println("##################################################");
//
//        String.join("", str.split(""))
//                .chars()
//                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
//                .forEach(ch -> System.out.println("Non repeated character is : " + (char) ch));

        LinkedHashMap<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        String output =collect.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(e -> e.getKey()).findFirst().get();
        System.out.println("First Non repeated character is : " + output);
    }
}
