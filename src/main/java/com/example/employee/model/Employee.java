package com.example.employee.model;

public class Employee {
    int employeeId;
    String employeeName;
    String email;
    String department;

    public Employee(int employeeId, String employeeName, String email, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDdepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

}