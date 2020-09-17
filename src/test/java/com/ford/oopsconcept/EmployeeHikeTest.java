package com.ford.oopsconcept;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeHikeTest {
    @Test
    public void shouldGetEmployeeHike() {
        EmployeeHike employeeHike = new EmployeeHike("pavi", 'F', "9500798747",
                new Department("IT","Information Technology"),
                new Address("cbe","tamilnadu"),35000.00, 0.05, 0.10,
                0.05);
        Assert.assertNotNull(employeeHike);
        System.out.println(employeeHike);
    }


}
