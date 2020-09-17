package com.ford.car;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void shouldHaveDefaultBrandName(){
        Car fordCar = new Car();
        //fordCar.brandName = "Generic";
        Assert.assertEquals("Generic", fordCar.brandName);

    }
    @Test
    public void shouldHaveDefaultColor(){
        Car fordCar = new Car();
        Assert.assertEquals("Red", fordCar.color);
    }

    @Test
    public void shouldHaveAssignableBrandName(){
        Car fordCar = new Car("bronco", ".");
        Assert.assertEquals("bronco", fordCar.brandName);
    }
    @Test
    public void shouldHaveAssignableColor(){
        Car fordCar = new Car(".", "Black");
        Assert.assertEquals("Black", fordCar.color);
    }

    @Test
    public void shouldAccelerate(){
        Car fordCar = new Car();
        String output = "I am a Red Generic car accelerating";
        Assert.assertEquals(output, fordCar.accelerate());
    }
    @Test
    public void shouldBrake(){
        Car fordCar = new Car("mustang","white");
        String output = "Driver wants to slow me down mustang white";
        Assert.assertEquals(output, fordCar.brake());
    }


    @Test
    public void shouldAccelerateAssignable(){
        Car fordCar = new Car("mustang","white");
        String output = "I am a white mustang car accelerating";
        Assert.assertEquals(output, fordCar.accelerate());

    }
    @Test
    public void shouldBrakeAssignable(){
        Car fordCar = new Car("mustang","white");
        String output = "Driver wants to slow me down mustang white";
        Assert.assertEquals(output, fordCar.brake());

    }
}
