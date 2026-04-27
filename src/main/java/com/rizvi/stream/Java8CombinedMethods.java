package com.rizvi.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8CombinedMethods {
    public static void main(String[] args) {

        Predicate<Integer> pred = (x) -> x % 2 == 0;
        Function<Integer, Integer> func = x -> x * x;
        Consumer<Integer> cons = x -> System.out.println(x);
        Supplier<Integer> suppl = () -> 10;

        if(pred.test(suppl.get())) {
            cons.accept(func.apply(suppl.get()));
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
