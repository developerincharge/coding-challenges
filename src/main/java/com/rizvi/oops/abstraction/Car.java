package com.rizvi.oops.abstraction;

public class Car extends Vehicle{

    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Car() {
        super();
    }
    public Car(int noOfTires) {
        super(noOfTires);
    }


    public int noOfDoors() {
        return 5;
    }

    @Override
    public void makeEngineStart() {
        System.out.println("Car engine is stared...");
    }

    @Override
    public void getSetGO() {
        System.out.println("Getting Started and Running");
    }

    @Override
    public void start() {
        super.setNoOfTires(8);
        this.setNoOfDoors(5);

        System.out.println("Car has number of doors: "+getNoOfDoors());
        System.out.println("Car has number of Tiers: "+getNoOfTires());
    }
}
