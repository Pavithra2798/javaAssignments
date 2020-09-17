package com.ford.computer;

public class Catalogue {
    public String name;
    public String brand;
    public int price;
    public int discount;
    public String typeOfDevice;
    public String typeOfConnector;

    public Catalogue() {
        this.name = "New Product";
        this.brand = "";
        this.price = 0;
        this.discount = 0;
        this.typeOfDevice = "Unknown";
        this.typeOfConnector = "Unknown";
    }

    public Catalogue(String name, String brand, int price, int discount, String typeOfDevice, String typeOfConnector) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.typeOfDevice = typeOfDevice;
        this.typeOfConnector = typeOfConnector;

    }

    public double discountToPriceConversion(int discount, double price) {
        return (this.discount > 0) ? this.price-(this.price * this.discount / 100) : this.price;

    }


}
