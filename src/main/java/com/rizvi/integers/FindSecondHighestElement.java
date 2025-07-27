package com.rizvi.integers;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElement {

    public static void main(String[] args) {

        int [] numbers = {5, 12, 15, 41, 88, 99, 77};


        int max = numbers[0];
        int secondMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] < max) {
                secondMax = numbers[i];
            }
        }
        if (secondMax == max) {
            System.out.println("There is no second highest element in the array : " + max);
        } else {
            System.out.println("Second highest element in the array is : " + secondMax);

            Integer SecondHighestElement = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
            System.out.println("Second highest element in the array is : " + SecondHighestElement);

        }


        Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
                .ifPresent(str -> System.out.println("Second highest element in the array is : " + str));



        Arrays.stream(numbers)
                .boxed()
                .sorted()
                .skip(1).findFirst()
                .ifPresent(str -> System.out.println("Second Lowest element in the array is : " + str));

    }
}
