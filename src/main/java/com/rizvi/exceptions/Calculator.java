package com.rizvi.exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

           a();
        }

        private static void a(){
          b();
        }
        private static void b(){
        c();
        }
        private static void c(){
        d();
        }
        private static void d(){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first number : ");
            long firstNum = input.nextLong();
            System.out.print("Enter your second number : ");
            long secondNum = input.nextLong();

            long result = 0;
            try {
//            int[] a = new int[5];
//            a[6] = (int) (firstNum / secondNum);
//            System.out.printf("Result is %d", result);
                result = firstNum / secondNum;
                System.out.printf("Total is : % d \n", result);
            } catch (IndexOutOfBoundsException exp) {
            System.out.printf("%s , enter valid number \n", exp.getMessage());
            } catch (ArithmeticException e) {
                System.out.printf("%s , enter valid number \n", e.getMessage());
            } catch (Throwable throwable) {
                System.out.println("General Exception \n");
                throw throwable;
            }finally {
                System.out.println("I am in finally Block");
            }
    }


}
