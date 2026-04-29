package com.rizvi.multithreading;

class RunnableThreadDemo {
    public static void main(String... args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        System.out.println("Tasks start time :  "+startTime);

        PrintTask t1 = new PrintTask('*');
        System.out.printf("\n %s Starting First Thread\n", Thread.currentThread().getName());
            new Thread(t1).start();
        Thread.sleep(1000);
        PrintTask t2 = new PrintTask('$');
        System.out.printf("\n %s Starting Second Thread\n", Thread.currentThread().getName());
            new Thread(t2).start();
        Thread.sleep(1000);
        PrintTask t3 = new PrintTask('#');
        System.out.printf("\n %s Starting Third Thread\n", Thread.currentThread().getName());
            new Thread(t3).start();
        Thread.sleep(1000);

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
            for (int i = 1; i <=1000 ; i++) {
                System.out.printf("%d:%c ", i, targetChar);
            }
            System.out.printf("\n %c  Task Done  \n", targetChar);
        }



    }
}
