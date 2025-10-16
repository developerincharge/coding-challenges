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


        System.out.println("############  Reversed order ##########");

        numbers.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);



        int[] arr = new int[] {12, 67, 86, 53, 11, 90, 82, 86, 25};

        System.out.println("############# Ascending Order ############");
        Arrays.stream(arr)
               // .boxed()
                //.map(nums -> nums % 2 == 0 ? "Even" : "Odd")
                .boxed()
                .sorted((a,b)-> a-b)
               // .sorted(Comparator.comparing(Integer::valueOf))
                .forEach(System.out::println);
    }
}
