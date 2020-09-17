package com.ford.oopsconcept;

import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
    @Test
    public void shouldGetAddress() {
        Address address = new Address("cbe","tn");
        //address.setCity("cbe");
        Assert.assertNotNull(address);
    }
}
