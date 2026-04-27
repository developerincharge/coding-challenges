package com.rizvi.integers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoIntArrays {

    public static void main(String[] args) {
//         int[] arr1 = {1, 3, 5, 7, 9, 11}; // do not use primitive type arrays
//         Integer[] arr2 = {2, 4, 6, 8, 10, 12}; // use wrapper class arrays
//         Or use Lists instead of arrays for better flexibility
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> arr2 = Arrays.asList(2, 4, 6, 8, 10, 12);

       List<Integer> mergeArray = Stream
               .concat(arr1.stream(), arr2.stream())
               .sorted()
               .collect(Collectors.toList());
         System.out.println(mergeArray);



    }
}
