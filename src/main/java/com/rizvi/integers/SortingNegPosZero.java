package com.rizvi.integers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingNegPosZero {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 3, -2, 0, -5,  0, 2, 0, 8, -4);
          List<Integer> moveZero = Stream.concat(numbers.stream().filter(n -> n != 0),
                          numbers.stream().filter(n -> n == 0)).collect(Collectors.toList());
        System.out.println(moveZero);



    }
}
