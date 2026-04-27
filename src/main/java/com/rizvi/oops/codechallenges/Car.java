package com.rizvi.oops.codechallenges;

public class Car extends Vehicle{

    @Override
    public void service() {
        super.service();
        System.out.println("Car is getting serviced");
    }
}
