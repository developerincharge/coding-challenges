package com.rizvi.integers;

import java.util.stream.IntStream;

public class SumOfDigits {


    public static void main(String[] args) {


        int num = 12345;

          // Java 7

       int sum = 0;
//        while (num > 0) {
//            sum = sum +num % 10;
//            num = num / 10;
//        }
//        System.out.println("Sum of digits is : " + sum);

        // java 8 Stream API
//        int sum1 = IntStream.of(1, 2, 3, 4, 5).sum();
//        System.out.println("Sum of digits is : " + sum1);


      sum  =   String.valueOf(num)
                .chars()
               // .peek(System.out::println)
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum of digits is : " + sum);
    }
}
