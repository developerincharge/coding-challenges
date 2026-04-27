package com.rizvi.oops.inheritance;

import java.util.StringJoiner;

public class Vehicle {
    private int numberOfTires = 2;

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires){

        this.numberOfTires = numberOfTires;
    }

    public void commute(){
        System.out.printf("I am commuting in a Vehicle using %d tires\n", numberOfTires);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vehicle.class.getSimpleName() + "[", "]")
                .add("numberOfTires=" + numberOfTires)
                .toString();
    }
}
