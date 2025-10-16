package com.rizvi.integers;

public class Factorial {

    public static int factorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int reccrusiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * reccrusiveFactorial(n - 1);

    }

    public static void main(String[] args) {

        System.out.println("Factorial of 5 is : " + factorial(5));
        System.out.println("RecursiveFactorial of 5 is : " + reccrusiveFactorial(5));

    }
}
