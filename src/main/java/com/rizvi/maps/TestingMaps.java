package com.rizvi.maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Syed", 69);
        map.put("Imtiaz", 85);
        map.put("Hassan", 100);
        map.put("Rizvi", 55);
        map.put("Nargis", 45);

        System.out.println(map.entrySet().iterator().next().getKey());
        System.out.println(map.entrySet().iterator().next().getValue());


        System.out.println("Size  :"+map.size());
        System.out.println("Get Key :"+map.get("Rizvi"));
        System.out.println("Contains Key : "+map.containsKey("Hassan"));
        System.out.println("Remove specific key/value : "+map.remove("Syed"));
        System.out.println(map.entrySet().iterator().next().getKey());
        System.out.println(map.entrySet().iterator().next().getValue());
        System.out.println("Size  : "+map.size());

        for(String key : map.keySet()) {
            System.out.printf("%s : %s\n ",key,map.get(key));
        }

    }
}
