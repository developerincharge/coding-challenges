package com.rizvi.oops.polymorphism;

public class TestTransportation {

    public static void main(String[] args) {

        Car c = new Car();
        //Vehicle v = new Vehicle();
        Plane p = new Plane();

//        Vehicle vCar = new Car();
//        Car cCar = (Car) new Vehicle();
//        Object oCar = new Vehicle();


        //castTest(v);
        castTest(c);
        castTest(p);
    }

    private static void castTest(Vehicle veh) {

//        Car cVeh = (Car) veh;
//        cVeh.start();
//        cVeh.noOfDoors();

        veh.start();

        if(veh instanceof Car) {
            System.out.println("Car is instantiated");
        }

    }
}
