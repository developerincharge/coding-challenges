package com.rizvi.coding;

import java.util.Scanner;

public class LookAndSayCompact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0, k = 1; j < s.length(); j++, k++) {
                if (j == s.length() - 1 || s.charAt(j) != s.charAt(j + 1)) {
                    sb.append(k).append(s.charAt(j));
                    k = 0;
                }
            }
            s = sb.toString();
        }
        System.out.println(s);
    }
}