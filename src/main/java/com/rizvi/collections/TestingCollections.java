package com.rizvi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer>  numList = new ArrayList<>();
        numList.add(6);
        numList.add(11);
        numList.add(-55);
        numList.add(9);
        numList.add(4);
        numList.add(38);
        numList.add(82);
        numList.add(1);
        Utility.print(numList);
        Collections.sort(numList);

        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);


        List<Integer> unModifiableList = Collections.unmodifiableList(numList);
        System.out.println("Un Modifiable List");
        Utility.print(unModifiableList);
       // unModifiableList.remove(7);
       // unModifiableList.add(25);
       // unModifiableList.reversed();
        Utility.print(unModifiableList);


    }
}
