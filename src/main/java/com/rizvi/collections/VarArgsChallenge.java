package com.rizvi.collections;

import java.util.Arrays;
import java.util.List;

public class VarArgsChallenge {

    public static void main(String... args) {

        String finalStr = concatenateStr("Hello,", "Welcome", "to", "Java", "Programming");
        System.out.println(finalStr);
    }
    public static String concatenateStr(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
          sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
