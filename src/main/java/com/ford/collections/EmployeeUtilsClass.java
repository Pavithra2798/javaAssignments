package com.ford.collections;

public class EmployeeUtilsClass {
    private String id;
    private String name;
    private String department;
    public int salary;


    public EmployeeUtilsClass(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeUtilsClass( ) {

    }

    public String getId( ) {
        return id;
    }

    public String getName( ) {
        return name;
    }

    public String getDepartment( ) {
        return department;
    }

    public double getSalary( ) {
        return salary;
    }
}
