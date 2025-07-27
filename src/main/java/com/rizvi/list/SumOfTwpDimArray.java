package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfTwpDimArray {

    public static void main(String[] args) {

        List<List<Integer>> multiList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8));

          int[][] twoDimArr = new int [][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        System.out.println("################  first method to sum  ##################");
        int sum1 = Arrays.stream(twoDimArr)
                .mapToInt(ints -> Arrays.stream(ints).sum()).sum();
        System.out.println(sum1);

        System.out.println("################  second method to sum  ##################");
           int sum = Arrays.stream(twoDimArr)
                .flatMapToInt(oneDimArr -> Arrays.stream(oneDimArr)).sum();
        System.out.println(sum);

        System.out.println("################  second method to sum  ##################");
        int sum2 = Arrays.stream(twoDimArr)
                .flatMapToInt(Arrays::stream).sum();
        System.out.println(sum2);

        System.out.println("################  third method to sum  ##################");
        int sum3 = multiList.stream()
                .flatMap(list -> list.stream())
                .reduce((x,y)-> x+y).get();

        System.out.println(sum3);

        System.out.println("################  fourth method to sum  ##################");
        int sum4 = multiList.stream()
                .flatMap(list -> list.stream())
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum4);

    }
}
