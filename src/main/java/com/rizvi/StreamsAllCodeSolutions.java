package com.rizvi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsAllCodeSolutions {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,8,101);
        int[] arr = {1,2,3,4};
        // Write a program to find the sum of all elements in a List using streams.
        System.out.println("######### Sum of all elements in a List using streams #########");
        int sums = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sums);


        //Given a List of integers, write a program to find the maximum element using streams.
        System.out.println("######### Maximum element in a List using streams #########");
        int max = nums.stream().max(Comparator.naturalOrder()).get();

        System.out.println("max element :"+max);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        //Given a List of strings, write a program to count the number of strings
        // that start with a specific character using streams.
        System.out.println("######### Count strings that start with 'c' #########");
        long fruitCount = fruits.stream().filter( s -> s.startsWith("c")).count();
        System.out.println("fruitCount: "+fruitCount);


        //Write a program to convert a List of strings to uppercase using streams.
        System.out.println("######### Convert a List of strings to uppercase #########");
        fruits.stream().map(String::toUpperCase).forEach(s -> {
            System.out.print("  "+s);});

        System.out.println();
        //Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.
        System.out.println("######### Filter out the even numbers #########");
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("######### Count even numbers #########");
        int even = (int) nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("no of even "+even);


        //Write a program to find the average of a List of floating-point numbers using streams.
        System.out.println("######### Average of a List of floating-point numbers #########");
        List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
        System.out.println(numsFloat);
        double avg = numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("avg : "+avg);


        //Given a List of strings, write a program to concatenate all the strings using streams.
        System.out.println("######### Concatenate all the strings #########");
        String concat = fruits.stream().collect(Collectors.joining());
        System.out.println(concat);

        //Write a program to remove duplicate elements from a List using streams.
        System.out.println("######### Remove duplicate elements from a List #########");
        fruits.stream().distinct().forEach(System.out::println);

        //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        System.out.println("######### Sort the objects based on a specific attribute #########");
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );
        System.out.println("#########   Using Comparator for sorting without Stream API ##########");

        Collections.sort(people, Comparator.comparing(Person::getAge));
        System.out.println(people);
        System.out.println();

        System.out.println("#########   Using Comparator for sorting Age with Stream API  ##########");



        people.stream().sorted(Comparator.comparing(Person::getAge)).toList().forEach(System.out::println);
        System.out.println();
        System.out.println("#########   Using Comparator for sorting Name with Stream API  ##########");
        people.stream().sorted(Comparator.comparing(Person::getName)).toList().forEach(System.out::println);


        System.out.println("#######  Elements in a List satisfy a given condition using streams ###");
        //Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);

        System.out.println("######  list of strings in ascending order using streams  ######");
        //Sort a list of strings in ascending order using streams.
        System.out.println("######### Sort a list of strings in ascending order #########");
        fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //Check if a list contains a specific element using streams.
        System.out.println("######### Check if a list contains a specific element #########");
        boolean exists = nums.stream().anyMatch(n -> n.equals(9));
        System.out.println(exists);

        //Create a new list containing the square of each element from the original list using streams
        System.out.println("######### Create a new list containing the square of each element #########");
        nums.stream().map(n -> n*n).collect(Collectors.toList()).forEach(System.out::println);

        //Find the average length of strings in a list using streams.
        System.out.println("######### Find the average length of strings in a list #########");
        OptionalDouble averageLength =  fruits.stream().mapToInt(String::length).average();
        System.out.println("Average length of strings: " + averageLength.orElse(0.0));

        //Find the longest string in a list using streams.
        System.out.println("######### Find the longest string in a list #########");
        String longestString = fruits.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Longest string: " + longestString);



//        Group a list of objects based on a specific attribute using streams.
//        List<Employee> sortedEmployees = people.stream()
//                .sorted(Comparator.comparing(Employee::getDepartment)
//                        .thenComparing(Employee::getSalary))
//                .collect(Collectors.toList());


        //Remove null values from a list using streams.
        System.out.println("######### Remove null values from a list #########");
        fruits = Arrays.asList("apple", null, "banana", "cherry", null, "coconut", "apple");
        List<String> nonNullValues = fruits.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(nonNullValues);


        //Find the second smallest element in a list of integers using streams.
        System.out.println("######### Find the second smallest element in a list of integers #########");
        Optional<Integer> secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();

        System.out.println("Second smallest element: " + secondSmallest.orElse(null));


        //Find the intersection of two lists using streams
        System.out.println("######### Find the intersection of two lists #########");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> intersection = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(intersection);


    }
}
