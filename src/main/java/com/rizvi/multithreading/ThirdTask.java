package com.rizvi.multithreading;

public class ThirdTask extends Thread{

    @Override
    public void run() {
        // Third Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d:# ", i);
        }
        System.out.println("\n # Task completed");
    }
}
