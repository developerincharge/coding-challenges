package com.rizvi.stream;

import java.util.Arrays;
import java.util.function.Consumer;

public class Java8Consumer {
    public static void main(String[] args) {

        // consumer consume input and return nothing
        Consumer<String> consumer = (s) -> System.out.println("Hello " + s);
        consumer.accept("Rizvi");

        Consumer<Integer> consumer1 = (i) -> {
            int square = i * i;
            System.out.println("Square of " + i + " is : " + square);
        };
        consumer1.accept(7);
        Arrays.asList(1,2,3,4,5,6,7,8,9).forEach(consumer1);



    }
}
