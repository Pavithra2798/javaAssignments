package com.ford.oopsconcept;

import org.junit.Assert;
import org.junit.Test;

public class DepartmentTest {
    @Test
    public void shouldGetDepartmentDetails() {
        Department department = new Department("IT", "Information");
        Assert.assertNotNull(department);
    }
}
