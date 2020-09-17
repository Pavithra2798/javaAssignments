package com.ford;

public class Rectangle {
    public int breadth;
    public int length;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateRectangleArea(int length, int breadth) {
        return length*breadth;
    }
}
