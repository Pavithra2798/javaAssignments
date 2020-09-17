package com.ford.inheritance;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFinancialTest {
    @Test
    public void shouldCalculateHike() {
        EmployeeFinancial employeeFinancial = new EmployeeFinancial("Pavithra", 'F',
                "9500798747", new Department("IT", "Information Technology"),
                new Address("coimbatore", "tamilNadu"),
                35000.00, 0.05, 0.10, 0.05);
    }

    @Test
    public void shouldGetListOfEmployees() {
        List<EmployeeFinancial> list = new ArrayList<>();
        EmployeeFinancial employeeFinancial1 = new EmployeeFinancial("Pavithra", 'F',
                "9500798747", new Department("Cse", "Information Technology"),
                new Address("coimbatore", "tamilNadu"),
                35000.00, 0.05, 0.10, 0.05);
        EmployeeFinancial employeeFinancial2 = new EmployeeFinancial("Ashi", 'F',
                "9500798747", new Department("IT", "Information Technology"),
                new Address("coimbatore", "tamilNadu"),
                35000.00, 0.05, 0.10, 0.05);
        EmployeeFinancial employeeFinancial3 = new EmployeeFinancial("Vidhi", 'F',
                "9500798747", new Department("IT", "Information Technology"),
                new Address("coimbatore", "tamilNadu"),
                35000.00, 0.05, 0.10, 0.05);
        list.add(employeeFinancial1);
        list.add(employeeFinancial2);
        list.add(employeeFinancial3);
//        returns the no.of list that matches the name
//        List<EmployeeFinancial> employee= list.stream().filter(x -> x.name.equals("Pavithra")).collect((Collectors.toList()));
//        assert with employee.size()
        //Grouping by the department
        Map<Department, List<EmployeeFinancial>> collect = list.stream().collect(Collectors
                .groupingBy(Employee::getDepartment));
        //System.out.println(collect);
//        Map<Department, List<EmployeeFinancial>> collect = list.stream().collect(Collectors
//                .partitioningBy(x -> x.getMonthlySalary() > 15000));//doing this we will partition into true and false column
        Assert.assertEquals(3,collect.size());

    }

    @Test
    public void shouldSortStrings() {
        List<String> stringList = new ArrayList<>();
        stringList.add("hi");
        stringList.add("hello");
        stringList.add("bye");
        TreeSet<String> collect = stringList.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect);
    }
    @Test
    public void shouldJoinStringsWithCommaSeparator() {
        List<String> stringList = new ArrayList<>();
        stringList.add("hi");
        stringList.add("hello");
        stringList.add("bye");
        String collect = stringList.stream().collect(Collectors.joining(","));
        Assert.assertEquals("hi,hello,bye", collect);
        System.out.println(collect);
    }
}
