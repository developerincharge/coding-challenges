package com.rizvi.integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EvenOdd {

    public static void main(String[] args) {

        List<Integer>  numbers = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);


        System.out.println("####################   Even Number    #################");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("##################   Odd Number    #################");

        numbers.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);


        System.out.println("####################");

        numbers.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);



        int[] arr = new int[] {10, 24, 25, 21, 86, 95, 100};

        System.out.println("##################");
        Arrays.stream(arr)
               // .boxed()
                //.map(nums -> nums % 2 == 0 ? "Even" : "Odd")
                .mapToObj(num -> Integer.valueOf(num))
               // .sorted((a,b)-> b-a)
                .sorted(Comparator.comparing(Integer::valueOf))
                .forEach(System.out::println);
    }
}
