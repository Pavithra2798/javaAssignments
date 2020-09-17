package com.ford.oopsconcept;

public class EmployeeHike extends Employee {
    private double updatedSalary;
    //private double salary;
    public double salaryAfterHike;
    private double taxForFemale;
    private double taxForMale;

    public double getTaxForFemale() {
        return taxForFemale;
    }

    public void setTaxForFemale(double taxForFemale) {
        this.taxForFemale = taxForFemale;
    }

    public double getTaxForMale() {
        return taxForMale;
    }

    public void setTaxForMale(double taxForMale) {
        this.taxForMale = taxForMale;
    }

    public double getHikePercentage() {
        return hikePercentage;
    }

    public void setHikePercentage(double hikePercentage) {
        this.hikePercentage = hikePercentage;
    }
    @Override
    public String toString() {
        return (super.toString() + "\nupdatedSalary=" + updatedSalary +
                "\nhikePercentage=" + hikePercentage*100 +"%" +
                "\nsalaryAfterHike=" + salaryAfterHike +
                "\ntaxForMale=" + taxForMale*100 + "%" +
                "\ntaxForFemale=" + taxForFemale*100 + "%");
    }

    private double hikePercentage;

    public EmployeeHike(String name, char gender, String phoneNumber, Department department, Address address, double salary,
                        double hikePercentage, double taxForMale, double taxForFemale) {
        super(name,gender,phoneNumber,department,address, salary);
        this.hikePercentage=hikePercentage;
        this.taxForMale=taxForMale;
        this.taxForFemale=taxForFemale;
        salaryAfterHike = (0.05 * this.salary) + (this.salary);

        if (gender == 'F')
        {
            getTaxForFemale();
            updatedSalary = salaryAfterHike -(taxForFemale * this.salaryAfterHike);
        }
        else
        {
            getTaxForMale();
            updatedSalary = salaryAfterHike -(taxForMale * this.salaryAfterHike);
        }

    }
}
