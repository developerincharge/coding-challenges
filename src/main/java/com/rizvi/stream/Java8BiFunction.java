package com.rizvi.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Java8BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println("Sum = " + biFunction.apply(10, 20));

        BiFunction<String, String,Integer> biFunction1 = (s1, s2) -> (s1 + s2).length();
        System.out.println("Total Length = " + biFunction1.apply("Syed", "Rizvi"));
        // This is a specialization of BiFunction for the case where
        // the operands and the result are of the same type.
        // A BinaryOperator is a functional interface
        // represents an operation upon two operands of the same type,
        // where producing a result of the same type as the operands.


        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("Multiplication = " + binaryOperator.apply(5, 6));
    }
}
