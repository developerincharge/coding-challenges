package com.rizvi.oops.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();
        Car car1 = new Car();
        Plane plane1 = new Plane();
//        car1.commute();
//        car1.makeEngineStart();
//        car1.getSetGO();
//        car1.start();
//        plane1.start();
        castTest(car1);
        castTest(plane1);
    }

    public static void castTest(Vehicle veh) {
        //Car cVeh = (Car) veh;
       // ((Car) veh).noOfDoors();
        veh.start();
        //cVeh.getNoOfTires();

//        if(veh instanceof Plane){
//            System.out.println("Plane is Instance of Vehicle");
//        }
    }


}
