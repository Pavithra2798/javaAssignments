package com.ford.calculations;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void shouldGetRadius(){
        Circle getRadius = new Circle(6);
        Assert.assertEquals(6, getRadius.radius);
    }
    @Test
    public void shouldCalculateCircleArea(){
        Circle getRadius = new Circle(6);
        Assert.assertEquals(113.04, getRadius.calculateAreaOfCircle(6), 2);
    }
    @Test
    public void shouldCalculateCircleCircumference(){
        Circle getRadius = new Circle(6);
        Assert.assertEquals(37.68, getRadius.calculateCircumferenceOfCircle(6), 2);
    }
}
