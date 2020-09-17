package com.ford.oopsconcept;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void shouldGetPersonDetails() {
        Person person = new Person("pavi", 'F', "9500798747",
                new Address("cbe","tamilnadu"));
        //person.name = "pavi";
        //person.gender ='F';
        //person.phoneNumber ="9500798747";
        Assert.assertNotNull(person);

    }
}
