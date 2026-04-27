package com.rizvi.oops.arraychallenge;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{2, 4, 6, 8});
        ArrayOperations.Statistics stats = opr.new Statistics();
        System.out.println(stats.mean());



    }
}
