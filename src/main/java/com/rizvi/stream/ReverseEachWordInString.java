package com.rizvi.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {


    public static void main(String[] args) {
        String str = "java streams are awesome";

          // first way
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Ist way to reversed a String:  " + reversedStr);

          // second way
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        System.out.println("2nd way to reversed a String: " + reversedString);

           // third way
        String reversedResult = Stream.of(str.split(" "))
                .map(word -> new StringBuilder(word)
                .reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("3rd way to reversed a String: " + reversedResult);
    }
}
