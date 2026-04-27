package com.rizvi.oops.codechallenges;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("Addition two integer : %d%n" ,calc.add(2,3));
        System.out.printf("Addition three integer : %d%n" ,calc.add(1,2,3));
        System.out.printf("Addition two double : %.2f%n" ,calc.add(3.5215,4.52156));

    }
}
