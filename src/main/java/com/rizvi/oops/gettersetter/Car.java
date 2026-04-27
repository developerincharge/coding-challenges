package com.rizvi.oops.gettersetter;

import java.util.StringJoiner;

public class Car {

    private String color;
    private String model;
    private int year;
    private double fuelLevel;
    private long purchasePrice;

    public Car(){}

    public Car(String color, String model,
               int year, double fuelLevel,
               long purchasePrice) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.purchasePrice = purchasePrice;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

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
