package com.rizvi.oops.polymorphism;

public class Overloading {

    public Overloading() {
        System.out.println("Default Constructor called.");
    }
    public Overloading(String pop){
        System.out.println("Constructor with argument");
    }


    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public String add(String s1, String s2){
       return s1+s2;
    }
    public String addition(String s1, String s2){
        return s1.concat(s2);
    }

    public static void main(String[] args) {

        Overloading ovr = new Overloading();
        int sum = ovr.add(4,8);
        int sum1 = ovr.add(4,8, 5,6);
        String hi = ovr.add("Hello", "  Syed");
        System.out.println("Addition : "+sum);
        System.out.println("Addition : "+sum1);
        System.out.println("Greeting : "+hi);
    }
}
