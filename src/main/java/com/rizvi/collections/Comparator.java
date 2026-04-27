package com.rizvi.collections;

import java.util.Arrays;
import java.util.List;


public class Comparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Elephant", "Dog", "Lion", "Ant", "Zebra", "Mouse", "Cat");
        //System.out.println(list);
         sortInDescendingOrder(list);
        //System.out.println(list);


    }
    public static void sortInDescendingOrder(List<String> strList) {
//        Collections.sort(strList);   // regular sorting

//        Collections.sort(strList, Collections.reverseOrder()); // reverse sorting

//        Collections.sort(strList, new java.util.Comparator<String>() {  // using comparator
//            public int compare(String s1 , String s2){
//                //return s2.compareTo(s1);
//                if(s1.equals(s2)) {
//                  return 0;
//                }else if(s1.charAt(0)<s2.charAt(0)){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        });

      List<String> sortedDesc = strList.stream()
              .sorted(java.util.Comparator.reverseOrder())
              .distinct()
              //.map(String::valueOf)
              .toList();
        System.out.println(sortedDesc);



    }
}
