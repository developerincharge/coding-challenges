package com.rizvi.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = isAnagram(str1, str2);
        System.out.println("String1: " + str1 + " String2: " + str2 + " are Anagrams : " + isAnagram);
    }

    private static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

//        char[] arr1 = str1.toLowerCase().toCharArray();
//        char[] arr2 = str2.toLowerCase().toCharArray();

//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);

      return str1.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList()).equals(str2.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList()));

    }
}
