package com.rizvi.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortingListDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Syed", "Rifat", "Karan", "ali", "Vivek", "Mohammad", "Imtiaz", "zaidi");

        System.out.println("\nPrinting with normal for loop");
        for(String name : names){
            System.out.print(" "+name);
        }
        System.out.println("\nSorting with Traditional for loop");

        for(int i= 0; i < names.toArray().length/2; i++){

        }

        System.out.println("\nSorting with naturalOrder()  using Comparator");

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        System.out.println("\nSorting with (String.CASE_INSENSITIVE_ORDER) using Comparator");

        names.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(names);

        System.out.println("\nSorting with Stream APi methods");
        List<String> sortedNames = names.stream().sorted().distinct().map(String::valueOf).toList();
        System.out.println(sortedNames);

        System.out.println("\nSorting with CompareTo method ");
                List<String> namesToSort = names.stream()

                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(namesToSort);
    }

}