package com.rizvi.list;

import java.util.Arrays;
import java.util.List;

public class MultiplyNumOfIntegerList {

    public static void main(String[] args) {

        System.out.println("#############  Product Multiplication of List  #############");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6 );
        int product = nums.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Result is : "+product);


        System.out.println("#############  Product Multiplication of Integer List  #############");

        int[] numsArr = new int[] {1, 2, 3, 4, 5, 6 };
        product = Arrays.stream(numsArr).reduce(1, (x, y) -> x * y);
        System.out.println("Results of Integer array multiplication is : "+product);

        int[] numsArr1 = new int[] {1, 2, 3, 4, 5, 6 };
        product = Arrays.stream(numsArr1).reduce((x, y) -> x * y).getAsInt();
        System.out.println("Product of Integer array multiplication is : "+product);
    }

}
