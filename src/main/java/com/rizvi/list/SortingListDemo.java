package com.rizvi.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortingListDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Syed", "Rifat", "Karan", "ali", "Vivek", "Mohammad", "Imtiaz", "zaidi");

        System.out.println("\nSorting with normal for loop");
        for(String name : names){
            System.out.print(" "+name);
        }

        System.out.println("\nSorting with naturalOrder()  using Comparator");

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        System.out.println("\nSorting with (String.CASE_INSENSITIVE_ORDER) using Comparator");

        names.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(names);
    }

}