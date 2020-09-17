package com.ford.employee;

import org.junit.Test;

public class EmployeeTest {
    @Test
    public void shouldGetEmployeeDetails(){
        Employee[] employeeArray = new Employee[4];
        employeeArray[0] = new Employee(1, "pavi", 20000, "ford");
        employeeArray[1] = new Employee(1, "ashi", 25000, "ford");
        employeeArray[2] = new Employee(1, "vidhi", 28000, "ford");
        employeeArray[3] = new Employee();
        //System.out.println(employee1.getDetails()+"\n"+employee2.getDetails()+"\n"+employee3.getDetails());
        Employee employee = new Employee();
        employee.getDetails(employeeArray);

    }

}
