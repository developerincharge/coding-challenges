package com.rizvi.integers;

import java.util.Arrays;
import java.util.List;

public class SquareSum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int total  = numbers.stream()
                .map(num -> num * num)
                .reduce(0, (x,y) -> (x + y));
             System.out.println("Square Sum is : " + total);



        total = numbers.stream().map(num -> num * num).reduce(0, Integer::sum);
        System.out.println("Square Sum is : " + total);

        System.out.println("##################    Square Sum   #################");

        int[] numArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double sum = Arrays.stream(numArr)
                .mapToDouble(num -> Math.pow(num, 2)).sum();
        System.out.println("Square Sum is : " + sum);
    }
}
