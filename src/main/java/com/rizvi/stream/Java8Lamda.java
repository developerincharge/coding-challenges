package com.rizvi.stream;

public class Java8Lamda {

    public static void main(String[] args) {

      // lambda expression ()->{} (no name, no return type, no access modifier)
      // lambda expression is an anonymous function that can be used to implement a functional interface
      // A functional interface is an interface that has only one abstract method
      // Runnable is a functional interface that has only one abstract method run()
        Thread t1 = new Thread(() -> {
            System.out.println("Hello from - "+ Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello : "+ i+" " +Thread.currentThread().getName());
              }
          });
        t1.start();
    }
}
