package com.rizvi.integers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementStartWithGivenValue {

    public static void main(String[] args) {

        int[] numbers ={34, 57, 28, 99, 21, 10, 52};

        List<String> elements =Arrays.stream(numbers)
                .boxed()
                .map(ele -> ele+"")
                .filter(ele -> ele.startsWith("2"))
                .collect(Collectors.toList());
            System.out.println(elements);




    }



}
