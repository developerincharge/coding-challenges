package com.rizvi.multithreading.join;

class JoinThreadDemo {
    public static void main(String... args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        System.out.println("Tasks start time :  "+startTime);

        PrintTask p1 = new PrintTask('*');
        System.out.printf("\n %s Starting First Thread\n", Thread.currentThread().getName());
           Thread t1 = new Thread(p1);
           t1.start();

        PrintTask p2 = new PrintTask('$');
        System.out.printf("\n %s Starting Second Thread\n", Thread.currentThread().getName());
           Thread t2 = new Thread(p2);
           t2.start();
           t1.join();

        PrintTask p3 = new PrintTask('#');
        System.out.printf("\n %s Starting Third Thread\n", Thread.currentThread().getName());
           Thread t3 = new Thread(p3);
           t3.start();
           t2.join();

        long endTime = System.currentTimeMillis();
        System.out.println("End time   "+ (endTime));
        System.out.println("Total time   "+ (endTime - startTime));
    }

    public static class PrintTask implements Runnable{

        private final char targetChar;
        public PrintTask(char targetChar) {
            this.targetChar = targetChar;
        }

        public void run(){
              // Print Task
            for (int i = 0; i <=1000 ; i++) {
                System.out.printf("%d :%c ", i, targetChar);
            }
            System.out.printf("\n %c  Task Done  \n", targetChar);
        }



    }
}
