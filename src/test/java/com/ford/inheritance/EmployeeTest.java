package com.ford.inheritance;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    @Test
    public void shouldGetEmployeeId(){
        Employee employee = new Employee("Pavithra",'F', "9500798747",
                new Department("IT","Information Technology"),
                new Address("coimbatore","tamilNadu"),35000.00);
        Assert.assertEquals(38, employee.getEmployeeId());
        System.out.println(employee);
    }

    @Test
    public void shouldAddGivenEmployees() {
        Employee employee = new Employee("Pavithra",'F', "9500798747",
                new Department("IT","Information Technology"),
                new Address("coimbatore","tamilNadu"),35000.00);
        Employee employee2 = new Employee("Ashi",'F', "9500798747",
                new Department("IT","Information Technology"),
                new Address("coimbatore","tamilNadu"),35000.00);
        Employee employee3 = new Employee("Vidhi",'F', "9500798747",
                new Department("IT","Information Technology"),
                new Address("coimbatore","tamilNadu"),35000.00);
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        System.out.println(list.toString());

    }
}
