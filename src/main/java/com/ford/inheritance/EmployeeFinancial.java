package com.ford.inheritance;

public class EmployeeFinancial extends Employee{
    public double taxForFemale;
    public double taxForMale;
    private double hikePercentage;

    public EmployeeFinancial(String name, char gender, String phoneNumber, Department department,
                             Address address, double monthlySalary, double hikePercentage,
                             double taxForMale, double taxForFemale) {
        super(name,gender,phoneNumber,department,address,monthlySalary);
        this.hikePercentage = hikePercentage;
        this.taxForMale = taxForFemale;
        this.taxForFemale = taxForFemale;
    }
}
