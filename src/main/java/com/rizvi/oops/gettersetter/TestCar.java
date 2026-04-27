package com.rizvi.oops.gettersetter;

public class TestCar {

    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(2024);
        car.setFuelLevel(20);
        car.setPurchasePrice(500000);

        System.out.println("Car  : "+car);
        System.out.printf("Car description  : %s %s %s" ,car.getColor(),car.getModel(), car.getYear() );
        System.out.println();
        System.out.println("Car Price : "+car.getPurchasePrice());
    }
}
