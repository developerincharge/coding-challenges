package com.rizvi.exceptions.codechallange;

import java.util.Scanner;

public class CalculatorExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int firstNum = Math.toIntExact(input.nextInt());
        System.out.print("Enter your second number : ");
        int secondNum = Math.toIntExact(input.nextInt());

        try {
            int result = firstNum / secondNum;
            System.out.printf("Result of division :   %d%n , ", result);
        } catch (ArithmeticException e) {
            if(e.getMessage().equals("/ by zero")){
                System.out.println("In valid number, divide by Zero not allowed");
            }else{
                throw e;
            }

        }
    }
}
