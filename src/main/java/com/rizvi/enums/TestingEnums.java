package com.rizvi.enums;

import java.sql.SQLOutput;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color2 = TrafficLight.valueOf("YELLOW");
        TrafficLight color3 = TrafficLight.valueOf("GREEN");
        TrafficLight color1 = TrafficLight.valueOf("RED");

//        System.out.println(color1.getAction());
//        System.out.println(color2.getAction());
//        System.out.println(color3.getAction());

      for(TrafficLight trafficLight : TrafficLight.values()){
          System.out.println(trafficLight.getAction());
      }


        Grade grade = Grade.D;

        System.out.println("Printing Days of the Week");
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.WEDNESDAY);
//        System.out.println(Day.THURSDAY);
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.SATURDAY);
//        System.out.println(Day.SUNDAY);

        for(Day day : Day.values()){
            System.out.printf("Day of Week : %S\n",day);
        }
        System.out.println("Printing Type of Days");
         for(Day day : Day.values()){
             System.out.printf("%S  : %S  \n", day, day.getType());
        }
    }
}
