package com.rizvi.collections;



public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(4, 5,7));
        System.out.println(sum(4, 5, 6,7));
        System.out.println(sum(4, 5, 6, 7 , 8 ,9));

    }

    public static int sum(int first,  int second, int... a){
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    public static int sum(int[] a ){
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }


//    public static int sum(int a, int b ){
//        return a+b;
//    }
}
