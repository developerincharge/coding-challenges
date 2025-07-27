package com.rizvi.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumElement {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);

         int max =  numbers.stream().max(Integer::compare).get();
        System.out.println("Maximum element is : " + max);

        int max1 =  numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum element is : " + max1);
    }
}
