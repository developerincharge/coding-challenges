package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("######   First way Array to Map Conversion Square######");
            Map<Integer, Integer> mapNums =  nums.stream()
                    .collect(Collectors.toMap(key -> key, num -> num*num));
            mapNums.forEach((key, val) -> System.out.println(key + " -*-> " + val));

    System.out.println("###### Array to Map Conversion Square ######");

        int[] numsArr = new int[] {10, 20, 30, 40, 50, 60};
                Map<Integer, Integer> mapNumsArr = Arrays.stream(numsArr)
                //.boxed()
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toMap(key -> key, num -> num*num));
        mapNumsArr.forEach((key, val) -> System.out.println(key + " -*-> " + val));

    }
}
