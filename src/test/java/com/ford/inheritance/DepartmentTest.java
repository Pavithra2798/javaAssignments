package com.ford.inheritance;

import org.junit.Assert;
import org.junit.Test;

public class DepartmentTest {
    @Test
    public void shouldGetDepartmentCode() {
        Department department = new Department("IT", "Information Technology");
        //department.departmentCode = "IT";
        //department.departmentName = "Information Technology";\
        Assert.assertEquals("IT", department.getDepartmentCode());
    }

    @Test
    public void shouldGetDepartmentName() {
        Department department = new Department("IT", "Information Technology");
        Assert.assertEquals("Information Technology", department.getDepartmentName());
    }
}
