package com.rizvi.oops.inheritance;

public class MotorCycle extends TwoWheeler{

    public void run(){
        int numberOfTires = 2;
        System.out.printf("MotorCycle runs on %d tires",numberOfTires);
    }

    public double fuelLevel;

    public void start(){
        int numberOfTires = 2;
        System.out.printf("\nMotorCycle is Started and running on %d tires",numberOfTires);
    }

}
