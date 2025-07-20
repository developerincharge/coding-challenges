package com.rizvi.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {


    public static void main(String[] args) {
        String str = "java streams are awesome";
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Ist way to reversed a String:  " + reversedStr);


        StringBuilder sb = new StringBuilder(str);

        String reversedString = sb.reverse().toString();

        System.out.println("2nd way to reversed a String: " + reversedString);
    }
}
