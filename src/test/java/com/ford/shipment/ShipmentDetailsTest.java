package com.ford.shipment;

import org.junit.Test;

public class ShipmentDetailsTest {
    @Test
    public void shouldDisplayShipmentDetails() {
        ShipmentDetails detail = new ShipmentDetails("pavithra", "bus", (float) 250.50, "chennai", "coimbatore");
        detail.createNewShipment("selvaraj", "ship", 200.0, "bangalore", "chennai");
        detail.printShipmentDetails();
    }
}
