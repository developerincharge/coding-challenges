package com.rizvi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8MethodReference {

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Rizvi", "Syed", "Ghaffar");
        //List<String> names = new ArrayList<>();
        //students.forEach(names::add);
        //names.forEach(System.out::println);
        students.forEach(System.out::println);
        System.out.println(" "+ students);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println("Even Numbers  "+numbers.stream().filter(isEven).count());
       List<Integer> even = numbers.stream().filter(isEven).toList();
         System.out.println("Even Numbers List: "+ even);
    }
}
