package com.rizvi.stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        //  A type of stream that enables parallel processing of data
        //  It divides the source of data into multiple parts
        //  and processes them concurrently using multiple threads
        // allowing multiple threads tp process parts of the stream simultaneously
        // workload is distributed across available CPU cores(in multiple threads)
        // This can lead to significant performance improvements for large datasets
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in sequential stream: " + (endTime - startTime) + " ms");
        long startTimeParallel = System.currentTimeMillis();
        List<Long> parallelFactorialsList = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Time taken in parallel stream: " + (endTimeParallel - startTimeParallel) + " ms");
        //System.out.println(parallelFactorialsList);
        
      // Parrallel streams are not always faster than sequential streams.
      // The overhead of managing multiple threads can outweigh the benefits of
      // parallelism for small datasets or most effective for CPU-intensive or
        // large datasets where the workload can be effectively divided among threads.
        // They may add overhead for simple tasks or small datasets.
    }
    private static long factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
