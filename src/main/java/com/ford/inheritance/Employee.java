package com.ford.inheritance;

public class Employee extends Person{
    private double monthlySalary;
    private Department department;
    private static int employeeId = 38;

    @Override
    public String toString() {
        return "department=" + department + "\n" +
                "monthly salary = " + monthlySalary + "\n" +
                "name = " + getName() + "\n" +
                "gender = " + getGender() + "\n" +
                "phoneNumber = " + phoneNumber + "\n" +
                "address = " + address ;
    }

    public Employee(String name, char gender, String phoneNumber, Department department, Address address, double salary) {
        super(name,gender,phoneNumber,address);
        this.department = department;
        this.monthlySalary = salary;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
