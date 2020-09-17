package com.ford.oopsconcept;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
    @Test
    public void shouldGetEmployeeId() {
        Employee employee = new Employee("pavi",'F',"9500798747", new Department("IT","Information"),
                new Address("cbe","tn"),35000);
        Assert.assertEquals(38,employee.getId());
        System.out.println(employee);
        //List<Employee> employeeList = Arrays.asList(employee,employee1,employee2);
//        Collections.sort(employeeList, new Comparator<Employee>() {//click Comparator to replace with lambda // extract using method ref too
//            public int compare(Employee 01,Employee o2){
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        //employeeList.forReach(System.out::println);
        //thenComparing(classname::field) can be used to compare another field too

    }
}
