package com.rizvi.integers;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + sum / numbers.size());

        System.out.println("################ Average   ####################");

             numbers.stream()
                     .mapToInt(Integer::intValue)
                     .average()
                     .ifPresent(System.out::println);

        System.out.println("#################   Sum   #################");

            Optional<Integer> optNum = numbers.stream().reduce((x, y) -> x+y);
            optNum.ifPresent(System.out::println);

        System.out.println("##################  sum  ################");

        int[] numArr = new int[] {12, 67, 86, 53, 11, 90, 82, 86, 25};
        int total = Arrays.stream(numArr).sum();
        System.out.println(total);

        System.out.println("##################   Average   #################");
        Arrays.stream(numArr)
                .average()
                .ifPresent(System.out::println);

        System.out.println("##############   Average for List Of Integers   ###############");

           OptionalDouble  optDoubleAverage = numbers.stream()
                //.mapToDouble(Integer::intValue)
                .mapToDouble(num -> num.doubleValue())
                .average();
        if (optDoubleAverage.isPresent())
            System.out.println("Avg  " +optDoubleAverage.getAsDouble());

        System.out.println("Average for the List of Integers : ");
        optDoubleAverage = Arrays.stream(numArr).average();
        optDoubleAverage.ifPresent(System.out::println);


        System.out.println("##############   Average for Double Integers of List  ###############");
        List<Double> floatNums = Arrays.asList(12.9, 67.8, 86.5, 53.5, 11.9, 90.8, 82.6, 86.9, 25.8);
        System.out.println("Average for the List of Floats : ");
        double doubleAvg = floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(doubleAvg);


    }
}
