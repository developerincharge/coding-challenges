package com.rizvi.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 1, 3, 4, 10, 6, 7, 8, 4, 1, 2, 3, 4, 5, 9, 2);
        System.out.println(Collections.frequency(numbers, 1));
        System.out.println(Collections.frequency(numbers, 2));
        System.out.println(Collections.frequency(numbers, 3));
        System.out.println(Collections.frequency(numbers, 4));
        System.out.println(Collections.frequency(numbers, 5));
        System.out.println(Collections.frequency(numbers, 6));
        System.out.println(Collections.frequency(numbers, 7));
        System.out.println(Collections.frequency(numbers, 8));
        System.out.println(Collections.frequency(numbers, 9));
        System.out.println(Collections.frequency(numbers, 10));
    }
}
