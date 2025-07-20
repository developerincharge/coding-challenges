package com.rizvi.integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingIntegerDemo {
    public static void main(String[] args) {

        int[] a = {10, 4, 3, 5, 6, 9, 7, 8, 2 ,1};
        // logic to sort the array without using sort()

        System.out.println("#####  Sorting with normal for loop ######");
        System.out.println("######  Approach 1 for loop and sort()  ######");
        // Approach 1
        for(int i =0; i < a.length; i ++){
            for(int j = i +1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = a [i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        // Approach 2
        List<Integer> numbers = Arrays.asList(10,2,5,7,1,6,3,9,4,8);
        System.out.println("\nSorting with normal for loop");
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);

                }
            }
        }
        System.out.println(numbers);

        System.out.println("######  Approach 2  using sort()  ######");
        // Approach 2  using sort()
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("######  Approach 3  using naturalOrder()  ######");
        System.out.println("\nSorting with naturalOrder() " +
                "" +
                "using Comparator");
        // Approach 3
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

}
