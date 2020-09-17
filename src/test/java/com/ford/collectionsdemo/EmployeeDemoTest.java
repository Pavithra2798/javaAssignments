package com.ford.collectionsdemo;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;


public class EmployeeDemoTest {
    @Test
    public void shouldPrintEmployeeDetail() {
        EmployeeDemo employeeDemo = new EmployeeDemo("A1","Pavi",
                "Sales","A5",340000,5);
        System.out.println(employeeDemo.printDetailsOfEmployee(employeeDemo));
    }

    @Test
    public void shouldPrintManagerEmployeeManagerId() {
        ArrayList<EmployeeDemo> arrayList=new ArrayList<>();
        EmployeeDemo employeeDemo1=new EmployeeDemo("A1","Sam","Sales",
                "A5",2350000,1);
        EmployeeDemo employeeDemo2=new EmployeeDemo("A2","John","IT",
                "A6", 1643000,4);
        EmployeeDemo employeeDemo3=new EmployeeDemo("A3","Mike","Marketing",
                "A7", 1643000,3);
        EmployeeDemo employeeDemo4=new EmployeeDemo("A4","Alex","Sales",
                "A8", 1643000,13);
        arrayList.add(employeeDemo1);
        arrayList.add(employeeDemo2);
        arrayList.add(employeeDemo3);
        arrayList.add(employeeDemo4);

        Assert.assertEquals("A6",employeeDemo2.getManagerId());

    }

    @Test
    public void shouldSortEmployeesBasedOnColumn() {
        ArrayList<EmployeeDemo> arrayList=new ArrayList<>();
        EmployeeDemo employeeDemo1=new EmployeeDemo("A3","Sam","Sales",
                "A5",2350000,1);
        EmployeeDemo employeeDemo2=new EmployeeDemo("A4","John","IT",
                "A6", 1643000,4);
        EmployeeDemo employeeDemo3=new EmployeeDemo("A1","Mike","Marketing",
                "A7", 1643000,3);
        EmployeeDemo employeeDemo4=new EmployeeDemo("A2","Alex","Sales",
                "A8", 1643000,13);
        arrayList.add(employeeDemo1);
        arrayList.add(employeeDemo2);
        arrayList.add(employeeDemo3);
        arrayList.add(employeeDemo4);

        Collections.sort(arrayList, new Comparator<EmployeeDemo>() {
            @Override
            public int compare(EmployeeDemo o1, EmployeeDemo o2) {
                return o1.getEmployeeId().compareTo(o2.getEmployeeId());
            }
        });
        System.out.println(arrayList);
    }

    @Test
    public void shouldGetTotalSalaryOfDepartment() {
        ArrayList<EmployeeDemo> arrayList=new ArrayList<>();
        EmployeeDemo employeeDemo1=new EmployeeDemo("A3","Sam","Sales",
                "A5",2350000,1);
        EmployeeDemo employeeDemo2=new EmployeeDemo("A4","John","IT",
                "A6", 1643000,4);
        EmployeeDemo employeeDemo3=new EmployeeDemo("A1","Mike","Marketing",
                "A7", 1643000,3);
        EmployeeDemo employeeDemo4=new EmployeeDemo("A2","Alex","Sales",
                "A8", 1643000,13);
        arrayList.add(employeeDemo1);
        arrayList.add(employeeDemo2);
        arrayList.add(employeeDemo3);
        arrayList.add(employeeDemo4);

    }
}
