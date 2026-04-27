package com.rizvi.integers;

public class SwappingNumber {

    private static int swapNumber(int number){
        int result = 0;
        while(number>0){
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {

        int number = 12345;
        int swappedNumber = swapNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Swapped Number: " + swappedNumber);
    }
}
