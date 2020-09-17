package com.ford.oopsconcept;

public class Employee extends Person {
    private Department department;
    double salary;
    private static int id = 38;

    public int getId() {
        return id;
    }
    public Employee(){
        super();
        id++;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, char gender, String phoneNumber, Department department,
                    Address address, double salary) {
        super(name,gender,phoneNumber,address);
        this.department = department;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return (super.toString() + "\ndepartment code: " + department.getDepartmentCode() + "\ndepartment name: " + department.getDepartmentName() + "\nsalary: " + salary);
    }
}
