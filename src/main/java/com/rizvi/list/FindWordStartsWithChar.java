package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordStartsWithChar {

    public static void main(String[] args) {
        String input = "apple banana mango box been fox apricot bike avocado";
        char ch = 'b';

//        List<String> repeatStartWords =   Arrays.stream(input.split(" "))
//                .filter(word -> word.startsWith(String.valueOf(ch)))
//                .collect(Collectors.toList());
//        System.out.println(repeatStartWords);

        Arrays.stream(input.split(" "))
                .filter(word -> word.startsWith(String.valueOf(ch)))
                .forEach(System.out::println);





    }
}
