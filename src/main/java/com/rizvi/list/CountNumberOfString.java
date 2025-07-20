package com.rizvi.list;

import java.util.*;

public class CountNumberOfString {

    public static void main(String[] args) {

        // Write your code here
        String[] items = {"dog","cat","elephant","Java","cat","python","learprograming","dog", "java"};

        Map<String, Integer> countItem = new HashMap<>();
        Arrays.stream(items).forEach(item -> countItem.put(item, countItem.getOrDefault(item, 0) + 1));
        TreeMap<String, Integer> sortedItems = new TreeMap<>(countItem);
        sortedItems.forEach((key, value) -> System.out.println(key + " -> " + value));

        List<String> list = new ArrayList<>(Arrays.asList("dog","cat","elephant","Java","cat","python","learprograming","dog", "java"));

        List<String> resultList = new ArrayList<>();



        list.forEach((str)-> {
            String newValue = lengthTransform(str);
            resultList.add(newValue);
        });
        System.out.println(resultList);

    }

     private static String lengthTransform(String str) {
          return  " Length for String : " + str  + " is " + str.length();




    }
}
