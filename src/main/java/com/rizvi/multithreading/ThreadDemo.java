package com.rizvi.multithreading;

class ThreadDemo {
    public static void main(String... args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        System.out.println("Tasks start time :  "+startTime);

        PrintTask t1 = new PrintTask('*');
        Thread.sleep(10);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        PrintTask t2 = new PrintTask('$');
        Thread.sleep(10);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        PrintTask t3 = new PrintTask('#');
        Thread.sleep(10);
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);

        long endTime = System.currentTimeMillis();
        System.out.println("End time   "+ (endTime));
        System.out.println("Total time   "+ (endTime - startTime));
    }


    public static class PrintTask extends Thread{


        private final char targetChar;
        public PrintTask(char targetChar) {
            this.targetChar = targetChar;
        }

        public void run(){
            for (int i = 1; i <=1000 ; i++) {
                System.out.printf("%d:%c ", i, targetChar);
            }
            System.out.printf("\n %c Task Done \n", targetChar);
        }



    }
}
