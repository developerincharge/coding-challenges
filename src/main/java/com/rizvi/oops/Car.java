package com.rizvi.oops;

import java.util.StringJoiner;

public class Car {
    public String color;
    public String model;
    public int year;
    private double fuelLevel;
    long purchasePrice;

    public Car(String color, String model, int year, double fuelLevel, long purchasePrice) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.purchasePrice = purchasePrice;
    }
    public Car(){}

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("color='" + color + "'")
                .add("model='" + model + "'")
                .add("year=" + year)
                .add("fuelLevel=" + fuelLevel)
                .add("purchasePrice=" + purchasePrice)
                .toString();
    }
}
