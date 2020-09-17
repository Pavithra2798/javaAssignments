package com.ford.collectionsdemo;

public class EmployeeDemo {
    String employeeId;
    String employeeName;
    String department;
    String managerId;
    int salary;
    int experience;

    public EmployeeDemo(String employeeId, String employeeName, String department,
                        String managerId, int salary, int experience) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.managerId = managerId;
        this.salary = salary;
        this.experience = experience;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", managerId='" + managerId + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public String printDetailsOfEmployee(EmployeeDemo employeeDemo) {
        return toString();

    }

}
