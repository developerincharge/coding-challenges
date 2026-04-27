package com.rizvi.stream;

import java.util.function.Supplier;

public class Java8Supplier {
    public static void main(String[] args) {
          // Supplier does not take any input but produces a result
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Random value : " + supplier.get());

        Supplier<Integer> integerSupplier = () -> 42;
        int integerAddition = integerSupplier.get() + 8;
        System.out.println("Integer value : " + integerAddition);

        Supplier<String> stringSupplier = () -> "Hello World!";
        System.out.println("String value : " + stringSupplier.get());
    }
}
