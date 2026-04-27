package com.rizvi.collections;

public class MyClass {
    public static void main(String[] args) {
        printMany("One","Two", "Three\n");
        printMany("One","Two","Three\n");
        printMany("One","Two\n");
        printMany();
        printMany(new String[]{"One","Two","Three\n"});
    }
    public static void printMany(String ...elements){
        for(String element : elements){
            System.out.print(" "+element);
        }

    }
}
