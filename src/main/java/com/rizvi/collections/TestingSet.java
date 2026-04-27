package com.rizvi.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();
        System.out.println(names.add("Syed"));
        System.out.println(names.add("Apple"));
        names.add("AI Coding");
        System.out.println(names.add("AirBus 747"));

        boolean isAdded = names.add("Syed");
        System.out.println(isAdded);

        boolean containsApple = names.contains("Apple");
        System.out.println(containsApple);
        Utility.print(names);
        names.remove("AI Coding");
        Utility.print(names);
        names.contains("AI Coding");
        Utility.print(names);


    }
}
