package com.rizvi.multithreading;
class MyThread extends Thread
{
    public void run()
    {
        Thread current = Thread.currentThread();
        System.out.printf("Running thread name : %s\n",current.getName());
        System.out.printf("Running thread priority : %s\n",current.getPriority());
    }
}
public class ThreadPriorarity {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.MIN_PRIORITY); //setting it to 1
        t2.setPriority(Thread.MAX_PRIORITY); //setting it to 10

        t1.setName("MyThread-1");
        t2.setName("MyThread-2");
        t1.start();
        t2.start();
    }


}
