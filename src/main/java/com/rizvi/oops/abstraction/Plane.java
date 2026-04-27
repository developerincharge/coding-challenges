package com.rizvi.oops.abstraction;

public class Plane extends Vehicle{

    @Override
    public void makeEngineStart() {

    }

    @Override
    public void getSetGO() {

    }

    @Override
    public void start() {
        super.start();
        System.out.println("Plane is taking off ..''..");
    }
}
