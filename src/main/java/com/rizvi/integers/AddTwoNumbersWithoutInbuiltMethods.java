package com.rizvi.integers;

public class AddTwoNumbersWithoutInbuiltMethods {


    /**
     * Returns the sum of a and b without using + operator or built-in functions
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public static int add(int a, int b) {

//        while (b > 0) {
//            a++;
//            b--;
//        }
//        // Handle negative b
//        while (b < 0) {
//            a--;
//            b++;
//        }
//
//        return a;



        while (b != 0) {
            int carry = a & b;  // Carry contains common set bits
            a = a ^ b;           // Sum of bits where one is set
            b = carry << 1;      // Carry is shifted by one
        }
        return a;

    }

    // Test cases
    public static void main(String[] args) {
        System.out.println("Testing add method:");

        int[][] testCases = {
                {0, 0},     // 0 + 0
                {5, 0},      // 5 + 0
                {0, 7},      // 0 + 7
                {3, 4},      // 3 + 4
                {-2, 5},     // -2 + 5
                {8, -3},     // 8 + -3
                {-1, -1},    // -1 + -1
                {100, 200}   // 100 + 200
        };

        for (int[] testCase : testCases) {
            int a = testCase[0];
            int b = testCase[1];
            int result = add(a, b);
            System.out.printf("add(%d, %d) = %d%n", a, b, result);
        }
    }
}
