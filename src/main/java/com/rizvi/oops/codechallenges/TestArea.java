package com.rizvi.oops.codechallenges;

public class TestArea {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        Square square = new Square(5.5, 8.2);

        circle.calculateArea();
        System.out.println();
        square.calculateArea();
    }
}
