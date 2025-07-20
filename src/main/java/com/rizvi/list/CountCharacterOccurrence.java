package com.rizvi.list;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

       String str = "gainjavaknowledge";

        char[] charArray = str.toCharArray();
        int[] count = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] != ' ') {
                    count[i]++;
                    charArray[j] = '0';
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (charArray[i] != '0' && charArray[i] != ' ') {
                System.out.print(" , "+charArray[i]+ " - " +count[i]);
            }
        }


        Map<String, Long> output= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
//                output.forEach((k, v) -> System.out.println(k + " --> " + v));
                System.out.println(output);

    }
}
