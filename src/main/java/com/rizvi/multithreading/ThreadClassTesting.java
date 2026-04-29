package com.rizvi.multithreading;

public class ThreadClassTesting {

    public static void main(String[] args) throws InterruptedException {

         long startTime = System.currentTimeMillis();
         System.out.println("\nTask start time :  " + startTime);

           FirstTask t1 = new FirstTask();
           SecondTask t2 = new SecondTask();
           ThirdTask t3 = new ThirdTask();

        System.out.printf("\n %s Starting First Thread\n", Thread.currentThread().getName());
           t1.start();
           Thread.sleep(1000);

        System.out.printf("\n %s Starting Second Thread\n", Thread.currentThread().getName());
           t2.start();
           Thread.sleep(1000);

        System.out.printf("\n %s Starting Third Thread\n", Thread.currentThread().getName());
           t3.start();
           Thread.sleep(1000);


        long endTime = System.currentTimeMillis();
          System.out.println("Task end time :  \n"+ (endTime));
          System.out.printf("\nTotal time taken: %s  :%d ", Thread.currentThread().getName(), (endTime - startTime));

    }
}
