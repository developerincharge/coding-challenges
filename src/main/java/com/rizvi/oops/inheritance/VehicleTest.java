package com.rizvi.oops.inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle();
        veh1.commute();

        System.out.println(veh1);
       Vehicle veh2 = new TwoWheeler();
       veh2.commute();
        System.out.println();
       TwoWheeler tw = new TwoWheeler();
            tw.getNumberOfTires();
            tw.balance();
        System.out.println();
       MotorCycle mt = new MotorCycle();
               mt.start();
                mt.getNumberOfTires();
                mt.balance();
                mt.run();
                mt.commute();

    }
}
