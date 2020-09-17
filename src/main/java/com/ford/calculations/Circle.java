package com.ford.calculations;

public class Circle {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateAreaOfCircle(int radius) {
        return Math.PI*Math.pow(this.radius,2);
    }

    public double calculateCircumferenceOfCircle(int radius) {
        return Math.PI*2*this.radius;
    }
}
