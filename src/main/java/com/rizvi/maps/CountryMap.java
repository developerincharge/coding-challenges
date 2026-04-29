package com.rizvi.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {

    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("India","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Iran","Tehran");
        countryMap.put("Afghanistan","Kabul");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country  : ");
        String country = input.next();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %S is  %S \n",country,countryMap.get(country));
        }else{
            System.out.printf("Capital of %s is %s is not available \n", country, countryMap.get(country));
        }
        System.out.println("######## Capital Of Countries ########");
        System.out.println("Printing the List of Countries");
        for(String key : countryMap.keySet()) {
            System.out.printf("%s  :  %s \n",key,countryMap.get(key));
        }
    }
}
