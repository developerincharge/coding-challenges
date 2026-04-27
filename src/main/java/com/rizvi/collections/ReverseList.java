package com.rizvi.collections;

import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        int i = 0;
        int rev = 0;
        for(i = 0; i < list.size()/2; i++){
            ElementSwapping.swap(list, i, list.size()-i-1);

            System.out.println();
        }
    }
}
