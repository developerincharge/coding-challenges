package com.rizvi.multithreading.codechallanges;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    private final int onTimeInMills;

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }
}
