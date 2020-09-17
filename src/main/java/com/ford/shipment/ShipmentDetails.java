package com.ford.shipment;

public class ShipmentDetails {
    private int id;
    private String shipperName;
    private String modeOfTransportation;
    float totalWeight;
    private String arrivalPort;
    private String departurePort;
    static private int nextShipmentId = 1000;

    public ShipmentDetails(String shipperName, String modeOfTransportation, float totalWeight, String arrivalPort, String departurePort) {
        this.shipperName = shipperName;
        this.modeOfTransportation = modeOfTransportation;
        this.totalWeight = totalWeight;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;
        this.id = nextShipmentId++;
    }

    static ShipmentDetails createNewShipment(String shipperName, String modeOfTransportation, double totalWeight, String arrivalPort, String departurePort) {
        ShipmentDetails object = new ShipmentDetails("Harry", "flight", 290, "delhi", "mumbai");
        return object;
    }

    public void printShipmentDetails() {
        System.out.println("ID:" + id + "\n" + "Shipper Name:" + shipperName + "\n" + "mode of transportation:" + modeOfTransportation + "\n" + "arrival port:" + arrivalPort + "\n" + "departure port:" + departurePort);
    }
}
