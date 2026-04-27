package com.rizvi.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A",  50);
        map.put("B", 20);
        map.put("F", 40);
        map.put("G", 30);
        map.put("E", 10);
        map.put("C", 11);
        map.put("D", 20);

        LinkedHashMap<String,Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Original Map: " + map);
        sortedMap.forEach((key,value)->{
            System.out.println("Key: " + key + " -  Value: " + value);
        });
        System.out.println("Sorted Map: " + sortedMap);
    }
}
