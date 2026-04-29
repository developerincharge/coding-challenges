package com.rizvi.multithreading;

public class DemoTwoThreads extends Thread {


    public void run(){

        String message = Thread.currentThread().getName();
        System.out.printf("Hello From : %s\n",message);
    }

    public static void main(String[] args) {
        DemoTwoThreads demo1 = new DemoTwoThreads();
        DemoTwoThreads demo2 = new DemoTwoThreads();

        demo1.start();
        demo2.start();
    }
}
