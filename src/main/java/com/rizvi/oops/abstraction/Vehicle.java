package com.rizvi.oops.abstraction;

import java.util.StringJoiner;

public abstract class Vehicle implements Transport{

    private int noOfTires;

    Vehicle(){
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void start(){

        System.out.println("Vehicle is Started .....");
    }

    public abstract void makeEngineStart();

    public void commute(){
        System.out.println("Vehicle can be driven");
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", Vehicle.class.getSimpleName() + "[", "]")
                .add("noOfTires=" + noOfTires)
                .toString();
    }
}
