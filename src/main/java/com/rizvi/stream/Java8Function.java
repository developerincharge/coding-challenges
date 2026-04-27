package com.rizvi.stream;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Java8Function {

    public static void main(String[] args) {
        // Function -->actually works, it accepts one argument and produces a result
        // like applies this function to the given argument it use an 'R apply(T t)' as
        // it returns the function result.( like apply the function on a given argument).

        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        Function<Integer, Integer> doubleThenTriple = doubleIt.andThen(tripleIt);
        System.out.println(doubleIt.apply(5)); // 5 X 2 => Output: 10
        System.out.println(tripleIt.apply(5)); // 5 x 3 => Output: 15
        System.out.println(doubleThenTriple.apply(5)); // 5 x 2 andThen 10 X 3 => Output: 30
        System.out.println(doubleIt.compose(tripleIt).apply(5)); // 5 x 3 compose 15 X 2 => Output: 30

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(7)); // Output: 7
        Function<String, Integer> stringToInteger = String::length;
        System.out.println(stringToInteger.apply("Hello")); // Output: 5
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("hello")); // Output: HELLO

        //  This is a specialization of Function for the case where an operation on a single
        //  operand that produces a result of the same type.
        // UnaryOperator --> it is a special case of Function where the input and output
        //  are of the same type.


        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(6)); // Output: 36

    }
}
