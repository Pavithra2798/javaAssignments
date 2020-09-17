package com.ford;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldGetLength(){
        Rectangle lengthAndBreadth = new Rectangle(6, 10);
        Assert.assertEquals(6,lengthAndBreadth.length);
    }
    @Test
    public void shouldGetBreadth(){
        Rectangle lengthAndBreadth = new Rectangle(6, 10);
        Assert.assertEquals(10,lengthAndBreadth.breadth);
    }
    @Test
    public void shouldCalculateRectangleArea(){
        Rectangle lengthAndBreadth = new Rectangle(6, 10);
        Assert.assertEquals(60, lengthAndBreadth.calculateRectangleArea(6,10));
    }
}
