package com.rizvi.integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxOrMinOrLargestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 35, 40, 40, 50, 55, 60, 75, 65, 35);

           // Second largest number
          int secondLargestNumber = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest number is : " + secondLargestNumber);
         // Maximum number
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println("Largest max number is :  "+max);

        // Minimum Number
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println("Minimum  number is :  "+min);


    }
}
