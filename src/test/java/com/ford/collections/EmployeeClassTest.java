package com.ford.collections;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EmployeeClassTest {
    @Test
    public void shouldCreateFile() throws IOException {
        EmployeeClass employeeClass = new EmployeeClass();
        //employeeClass.createSortedEmployeesFile();
        Assert.assertTrue(employeeClass.createSortedEmployeesFile());
    }

    @Test
    public void shouldCheckFileExistence() {
        EmployeeClass employeeClass = new EmployeeClass();
        //employeeClass.checkFileExistence();
        Assert.assertTrue(employeeClass.checkFileExistence());
    }

    @Test
    public void shouldPrintEmployeeInformation() throws FileNotFoundException {
        EmployeeClass employeeClass = new EmployeeClass();
        employeeClass.printInformation();
        System.out.println(employeeClass);
    }

    @Test
    public void shouldReturnManagerForEmployee() {
        EmployeeClass employeeClass = new EmployeeClass();
        System.out.println(employeeClass.getManager("pavi"));
        //employeeClass.managerInfo();
    }

    @Test
    public void shouldSortEmployeesBasedOnColumnName() throws IOException {
        EmployeeClass employeeClass = new EmployeeClass();
        employeeClass.sortEmployeesBasedOnColumnName(4);
    }

    @Test
    public void shouldReturnTotalSalaryForDepartment() throws IOException {
        EmployeeClass employeeClass = new EmployeeClass();
        System.out.println(employeeClass.sumOfSalaryForDepartment("Sales"));
    }

    @Test
    public void shouldChangeManager() {
        EmployeeClass employeeClass = new EmployeeClass();
        employeeClass.changeManager("Sundar");
    }
}
