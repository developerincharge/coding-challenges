package com.rizvi.multithreading.join;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Created the Thread %s \n",t1.getState());
        try{
        t1.start();
        t1.join();
            System.out.printf("Thread %s is finished\n",t1.getState());
        ThreadState t2 = new ThreadState();
        t2.start();
        t2.join();
            System.out.printf("Thread is %s is started\n",t2.getState());
    }catch(InterruptedException e) {
            System.out.println("Thread has error");
        }
        ThreadState t3 = new ThreadState();
        t3.start();
        t3.join();
        System.out.printf("Thread is %s is started\n",t3.getState());
      //  System.out.println("Thread has error");


    }


}
