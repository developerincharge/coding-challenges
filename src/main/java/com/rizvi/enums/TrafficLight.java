package com.rizvi.enums;

public enum TrafficLight {
    YELLOW("slow down"),
    RED("stop"),
    GREEN("start");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }
}
