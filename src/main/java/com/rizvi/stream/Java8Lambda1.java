package com.rizvi.stream;


public class Java8Lambda1 {
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            System.out.println("Calculate Functions in Lambda Expression");
        });

        MathOperation sumOperation = Integer::sum;
        MathOperation divideOperation = (a, b) -> a / b;
        MathOperation multiplyOperation = (a, b) -> a * b;
        MathOperation substracteOperation = (a, b) -> a - b;

        System.out.println("Sum: " + sumOperation.operate(5, 10));
        System.out.println("Divide: " + divideOperation.operate(10, 5));
        System.out.println("Multiply: " + multiplyOperation.operate(5, 10));
        System.out.println("Substracyion: " + substracteOperation.operate(10, 5));
        t1.start();
    }

}

interface MathOperation {
    int operate(int a, int b);
}
