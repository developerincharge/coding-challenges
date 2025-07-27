package com.rizvi.integers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfDigits {


    public static void main(String[] args) {


        int num = 12345;

          // Java 7
        System.out.println("##########  traditional Java 7  ##########");
       int sum = 0;
        while (num > 0) {
            sum = sum +num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is : " + sum);

          //  java 8 stream API
        System.out.println("##########  Sum of digits using java 8 IntStream API  ##########");
        // java 8 Stream API
        int sum1 = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println("Sum of digits is : " + sum1);

        int num1 = 12345;

        System.out.println("### Sum of digits using chars() and getNumericValue()  ###");
        // java 8 stream API
     int sum2  =   String.valueOf(num1)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum of digits is : " + sum2);

        System.out.println("########  Sum of digits using mapToInt() ##########");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
            int sum3 =  nums.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum of digits is : " + sum3);
    }
}
