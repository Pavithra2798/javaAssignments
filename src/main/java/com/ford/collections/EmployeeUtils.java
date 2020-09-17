package com.ford.collections;

public class EmployeeUtils<T> {
    public void compareSalary(FordEmployee fordEmp, TeslaEmployee teslaEmp) {
        if(fordEmp.getSalary() > teslaEmp.getSalary())
            System.out.println("Ford has high salary");
        else
            System.out.println("Tesla has high salary");
    }

}
