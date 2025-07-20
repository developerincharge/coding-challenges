package com.rizvi.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestStringFromArray {

    public static void main(String[] args) {

        String [] names = {"Syed", "Rifat", "Karan", "Javaknowledgeofstreamapi", "Vivek", "Mohammad", "Imtiaz"};

        String longestString = Arrays.stream(names).max(Comparator.comparingInt(String::length)).get();


        System.out.println(longestString);



        List<String> list = new ArrayList<>(Arrays.asList("Syed", "Rifat", "Karan", "Javaknowledgeofstreamapi", "Vivek", "Mohammad", "Imtiaz"));

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
