package com.rizvi.multithreading;


public class NeedOfMultiThreading {
    public static void main(String[] args) {
       long startTime = System.currentTimeMillis();
        System.out.println("Tasks start time :  "+startTime);

         // First Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d:* ", i);
        }
        System.out.println("\n * Task completed");
        // Second Task
        for (int i = 1; i <= 1000 ; i++) {
        System.out.printf("%d:$ ", i);
    }
        System.out.println("\n $ Task completed");
        // Third Task
        for (int i = 1; i <= 1000 ; i++) {
        System.out.printf("%d:# ", i);
        }
          System.out.println("\n # Task completed");
        // Fourth Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d:& ", i);
        }
        System.out.println("\n & Task completed");
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken  "+ (endTime - startTime));
    }

}
