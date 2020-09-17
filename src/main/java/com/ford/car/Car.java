package com.ford.car;

public class Car {
    public String brandName;
    public String color;

    public Car(){
        this.brandName = "Generic";
        this.color = "Red";
    }

    public Car(String brandName, String color) {
        this.brandName = brandName;
        this.color = color;
    }

    public String accelerate() {
        return "I am a "+this.color+" "+this.brandName+" car accelerating";
    }

    public String brake() {
        return "Driver wants to slow me down "+this.brandName+" "+this.color;
    }
}

