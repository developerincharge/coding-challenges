package com.rizvi.oops.inheritance;

public class TwoWheeler extends Vehicle{
     TwoWheeler(){
         setNumberOfTires(2);
     }

    public int getNumberOfTires(){
         int numberOfTires=2;
        System.out.printf("Two wheeler has %d tires\n",numberOfTires);
        return numberOfTires;
    }
    public void balance(){
         int numberOfTires = 2;
        System.out.printf("Two wheeler is balancing on %d tires\n" ,numberOfTires);
    }
}
