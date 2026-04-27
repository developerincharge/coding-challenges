package com.rizvi.oops.codechallenges;

public class Square extends Shape {

    double width;
    double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double areaOfSquare = width * height;
        System.out.printf("Area Of Square :  %.2f",areaOfSquare);

        return areaOfSquare;
    }
}
