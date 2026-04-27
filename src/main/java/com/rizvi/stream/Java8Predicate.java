package com.rizvi.stream;

import java.util.function.Predicate;

public class Java8Predicate {

    public static void main(String[] args) {
        // Predicate is a functional interface that takes one argument and returns a boolean value
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4)); // true

        System.out.println("Is 5 even? " + isEven.test(5)); // false

        Predicate<String> isLongerThan5 = (s) -> s.length() > 5;
        System.out.println("Is 'HelloWorld' longer than 5? : " + isLongerThan5.test("HelloWorld")); // true
        System.out.println("Is 'Hi' longer than 5? : " + isLongerThan5.test("Hi")); // false

        Predicate<String> isWordStartsWithA = (s) -> s.toUpperCase().startsWith("A");
        Predicate<String> isWordEndsWithE = (s) -> s.toUpperCase().endsWith("E");
        Predicate<String> checking = isWordStartsWithA.and(isWordEndsWithE);
        System.out.println("Does 'Apple' start with A and end with E?  : " + checking.test("APPLE")); // true
    }
}
