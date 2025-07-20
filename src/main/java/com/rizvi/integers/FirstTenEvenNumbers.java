package com.rizvi.integers;

import java.util.stream.IntStream;

public class FirstTenEvenNumbers {

    public static void main(String[] args) {
  //   java 7
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(" "+i);
        }
        System.out.println();

        // Java 8 Stream API
        int[] evenNumbers = IntStream.rangeClosed(2, 20)
                .filter(i -> i % 2 == 0).toArray();
        for (int evenNumber : evenNumbers) {
            System.out.print(" " + evenNumber);
        }
        System.out.println();

        int sum = IntStream.rangeClosed(2, 20)
                .filter(i -> i % 2 == 0).sum();
        System.out.println(" Sum of first 10 even numbers is : " + sum);


    }
}
