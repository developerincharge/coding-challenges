package com.rizvi.list;

import java.util.Arrays;
import java.util.List;

public class ParallelSum {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        int squareSum = nums.parallelStream().map(num -> num * num).reduce(0, Integer::sum);
        System.out.println("Sum of List of Squares : " + squareSum);


        int[] numsArr = new int[] {10, 20, 30, 40, 50};

        int squareSum2 = Arrays.stream(numsArr).parallel().map(num -> num * num).reduce(0, Integer::sum);
        System.out.println("Sum of Intger Array of Squares : " + squareSum2);

        int squareSum3 = Arrays.stream(numsArr).parallel().map(num -> num * num).reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Intger Array of Squares : " + squareSum3);


    }
}
