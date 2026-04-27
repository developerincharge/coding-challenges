package com.rizvi.stream;

import java.util.function.BiPredicate;

public class Java8BiPredicate {
    public static void main(String[] args) {
        // BiPredicate is a functional interface that takes
        // two arguments and then returns a boolean value
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;

        System.out.println("Is sum of 4 and 6 even? " + biPredicate.test(4, 6)); // true
        System.out.println("Is sum of 2 and 5 even? " + biPredicate.test(2, 5)); // false
    }
}
