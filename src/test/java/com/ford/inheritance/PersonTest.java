package com.ford.inheritance;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void shouldGetPersonDetails() {
        Person person = new Person("Pavithra", 'F', "9500798747", new Address("coimbatore","tamilNadu"));
        Assert.assertNotNull(person);
    }

    @Test
    public void shouldTestHashCodeAndEqualsFunction() {
        Person person = new Person("Pavithra", 'F', "9500798747", new Address("coimbatore","tamilNadu"));
        Person person2 = new Person("Pavithra", 'F', "9500798747", new Address("coimbatore","tamilNadu"));
        System.out.println(person.hashCode() + " " + person2.hashCode());
        System.out.println(person.equals(person2));
    }
}
