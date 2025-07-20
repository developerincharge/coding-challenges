package com.rizvi.integers;

import java.util.stream.IntStream;

public class FindSumOfNaturalNumbers {

    public static void main(String[] args) {

        // Java 7
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("using forloop to find Sum of first 10 natural numbers is : " + sum);

        // Java8 Stream API
        int sum1 = IntStream.range(1, 11).sum();
        System.out.println("Using Java 8 Stream API to find Sum of first 10 natural numbers is : " + sum1);

        int sum2 = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Using Java 8 Stream API to find Sum of first 10 natural numbers is : " + sum2);
    }
}
