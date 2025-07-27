package com.rizvi.list;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterFrequency {

    public static void main(String[] args) {


        // java  7
          String str = "hello world";
          str = str.toLowerCase();
          char[] chars = str.toCharArray();
          int count = 0;
          for (int i = 0; i < chars.length; i++) {
              if (chars[i] == ' ') {
                  continue;
              }
              count = 1;
              for (int j = i + 1; j < chars.length; j++) {
                  if (chars[i] == chars[j]) {
                      count++;
                      chars[j] = '0';
                  }
              }
              if (chars[i] != '0') {
                  System.out.print("  Letter:  "+ chars[i] + " ->  " + count+" ,");
              }
          }

        System.out.println();
        System.out.println("##################");

               //  java 8 stream API

          String str1 = "hello world";
        IntStream stream =  str.chars();
        Map<Character,Long> characterMap = stream.mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        characterMap.forEach((k, v) -> System.out.println("Letter :   "+ k + " number of times :  -> " + v));
    }
}
