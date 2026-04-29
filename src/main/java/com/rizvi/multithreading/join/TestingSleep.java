package com.rizvi.multithreading.join;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <100000 ; i++) {
            Thread.sleep(1000);
            System.out.printf("Thread Woke Up %d  :\n",i);

        }
    }
}
