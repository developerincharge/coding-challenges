package com.rizvi.integers;

import java.util.Arrays;
import java.util.List;

public class MethodJoinDemo {


    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        String result = String.join("  <  ", numbers);

        System.out.println(result);

        String result1 = String.join("  -> ", "1","2","3","4","5","6","7","8","9","10");
        System.out.println(result1);


    }

}
