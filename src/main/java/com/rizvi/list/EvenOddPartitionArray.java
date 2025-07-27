package com.rizvi.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartitionArray {

 public static void main(String[] args) {
        // Partition an array of Integers into two groups: even and odd numbers using streams
     System.out.println("####################   Even & Odd Numbers List Array  #################");

     List<Integer> nums = Arrays.asList(12, 67, 86, 53, 11, 90, 82, 86, 25);

       Map<Boolean, List<Integer>> mapNums = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
     System.out.println("Even Numbers  :   "+mapNums.get(true));
     System.out.println("Odd Numbers  :   "+mapNums.get(false));

     System.out.println("####################   Even & Odd Numbers Integers Array   #################");

     int[] intArr = new int[] {10, 24, 25, 21, 86, 95, 100};
     Map<Boolean, List<Integer>> numsToEvenOdd = Arrays.stream(intArr)
             .mapToObj(Integer::valueOf)
             .collect(Collectors.partitioningBy(n -> n % 2 == 0));
            // .forEach((key, val) -> System.out.println(key + " ---> " + val));
     System.out.println("Even Numbers  :   "+numsToEvenOdd.get(true));
     System.out.println("Odd Numbers  :   "+numsToEvenOdd.get(false));




    }
}
