package com.ford.oopsconcept;

import java.util.Objects;

public class Person {
    String phoneNumber;
    char gender;
    String name;
    Address address;

    public Person() {

    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, char gender, String phoneNumber, Address address) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String toString(){
        return ("Name: " +name + " \ngender: " + gender + "\nphone number: " + phoneNumber + "\ncity:" + address.getCity() +
                "\nstate: " + address.getState());
    }
}
