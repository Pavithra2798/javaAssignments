package com.ford.employee;

public class Employee {
    int id;
    String name;
    int salary;
    String company;

    public Employee(int id, String name, int salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public Employee() {
        this.id = 0;
        this.name = "unknown";
        this.salary = 0;
        this.company = "unknown";
    }

    public void getDetails(Employee[] employee) {
        for (Employee emp:employee
             ) {
            System.out.println(emp.id+" "+emp.name+" "+ emp.salary+" "+emp.company);
        }
    }
}
