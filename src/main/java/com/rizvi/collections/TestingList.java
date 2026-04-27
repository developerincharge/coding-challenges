package com.rizvi.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList();
        strList.add("Syed");
        strList.add("Imtiaz");
        strList.add("Rizvi");
        System.out.println(strList.size());
        System.out.println(strList.get(2));

        strList.add(2, "Hassan");
        strList.remove(3);

//        for (int i = 0; i < strList.size(); i++) {
//            System.out.print(" "+strList.get(i));
//        }
         Utility.print(strList);

        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for (int i = 1; i <= list.size(); i++) {
//            System.out.print(" "+i);
//        }
    Utility.print(list);
    }
}
