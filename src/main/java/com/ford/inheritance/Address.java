package com.ford.inheritance;

public class Address {
    private String state;
    private String city;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
