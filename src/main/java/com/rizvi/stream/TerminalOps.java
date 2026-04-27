package com.rizvi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 9, 2, 3, 4, 5, 5,6, 7, 8, 9, 10);

        // 1. collect()
        Set<Integer> listCollect = list.stream().skip(1).collect(Collectors.toSet());
        System.out.println("Collect to Set: " + listCollect);

        // 2. forEach()
             list.stream().forEach(n-> System.out.println("For Each:  " +n+", "));

        // 3. reduce()
        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum);

        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        optionalInteger.ifPresent(value -> System.out.println("Sum using reduce with Optional: " + value));
        //System.out.println("Sum using reduce with Optional: " + optionalInteger.get());

        // 4. count()

        long count = list.stream().count();
        System.out.println("Count using count(): " + count);
       // all are short circuit operations
        // 5. min()
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Min using min(): " + value));

        // 6. max()
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max using max(): " + value));

        // 7. anyMatch()
        boolean anyMatchStream = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Any Match (even number) using anyMatch(): " + anyMatchStream);

        // 8. allMatch()
        boolean match = list.stream().allMatch(x -> x > 0);
        System.out.println("All number greater than zero using allMatch(): " + match);

        // 9. noneMatch()
        boolean noneMatchStream = list.stream().noneMatch(x -> x < 0);
        System.out.println("No negative number using noneMatch(): " + noneMatchStream);

        // 10. findFirst()
        Optional<Integer> findFirst = list.stream().findFirst();
        findFirst.ifPresent(value -> System.out.println("First element using findFirst(): " +
                value));
        System.out.println(list.stream().findFirst().get());

        // 11. findAny()
        Optional<Integer> findAny = list.stream().findAny();
        findAny.ifPresent(value -> System.out.println("Any element using findAny(): " +
                value));

        // 12. toArray()
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println("Array using toArray(): " + Arrays.toString(array));

        // Examples of terminal operations
        List<String> names = Arrays.asList( "Charlie", "David","Alice", "Bob", "Eve");
        // Using collect() to gather names into a List
        List<String> nameList = names.stream().collect(Collectors.toList());
        System.out.println("Names List: " + nameList);
        // Using toList() to gather names from List if length greater than 3
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        System.out.println(numbers.stream().map(n -> n * 2).toList());
        System.out.println(numbers.stream().map(n -> n * n).sorted().toList());

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(nums.stream().reduce(0, (a, b) -> a + b));

        System.out.println(nums.stream().reduce(Integer::sum).get());

        String sentence = "This is a sample sentence";
        System.out.println(sentence.chars().filter(x -> x == 's').count());

        // stateless operations

        IntStream.range(1, 10)
                .filter(x -> x % 2 == 0) // stateless
                .map(x -> x * x)        // stateless
                .forEach(System.out::println); // terminal



    }
}
