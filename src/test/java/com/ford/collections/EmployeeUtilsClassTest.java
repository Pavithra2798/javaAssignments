package com.ford.collections;

import org.junit.Test;

public class EmployeeUtilsClassTest {
    @Test
    public void shouldCompareSalaryOfTeslaEmployee() {
        EmployeeUtilsClass employeeUtilsClass = new EmployeeUtilsClass();
        FordEmployee fordEmployee = new FordEmployee("1","Mike","IT",550000);
        TeslaEmployee teslaEmp = new TeslaEmployee("2","John","Sales",350000);
        EmployeeUtils employeeUtils=new  EmployeeUtils();
        fordEmployee.getSalary();
        teslaEmp.getSalary();
        employeeUtils.compareSalary(fordEmployee,teslaEmp);

    }
}
