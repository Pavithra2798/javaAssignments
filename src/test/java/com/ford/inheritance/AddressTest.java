package com.ford.inheritance;

import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
    @Test
    public void shouldGetAddress() {
        Address address = new Address("coimbatore", "tamilNadu");
        Assert.assertNotNull(address);
    }
}
