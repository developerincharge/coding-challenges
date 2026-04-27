package com.rizvi.coding;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class LookAndSayStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        String result = java.util.stream.Stream.iterate("1", s -> 
            Pattern.compile("(\\d)\\1*")
                   .matcher(s)
                   .results()
                   .map(m -> m.group().length() + m.group().substring(0, 1))
                   .collect(Collectors.joining())
        ).limit(n).reduce((first, second) -> second).get();
        
        System.out.println("The " + n + "th term is: " + result);
    }
}