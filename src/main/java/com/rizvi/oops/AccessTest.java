package com.rizvi.oops;

public class AccessTest {

    public static void main(String[] args) {
         Car car = new Car();
         car.color = "Red";
            car.model = "Tesla Model S";
            car.year = 2026;

            Car newCar = new Car("Black", "Audi", 2025, 20.0, 125000);
        System.out.println("Car : " + car);
             System.out.println("New Car : " + newCar);
    }
}
