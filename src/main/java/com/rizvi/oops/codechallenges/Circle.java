package com.rizvi.oops.codechallenges;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = radius * Math.PI * Math.pow(radius,2);
        System.out.printf("Area of Circle : %.2f ",area);
        return area;
    }
}
