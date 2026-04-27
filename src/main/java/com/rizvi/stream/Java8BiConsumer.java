package com.rizvi.stream;

import java.util.function.BiConsumer;

public class Java8BiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println("Sum: " + (a + b));
            System.out.println("Product: " + (a * b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Quotient: " + (a / b));
        };

        biConsumer.accept(5, 10);


        BiConsumer<Integer, String> biConsumer1 = (a, b) -> {
            System.out.println("Integer value: " + a);
            System.out.println("String value: " + b);
        };
        biConsumer1.accept(100, "Hello BiConsumer");
    }
}
