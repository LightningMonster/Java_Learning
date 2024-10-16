/*
 * Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().
 */
package Sem_5_slips;

class Employee {
    // Employee attributes
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSalary;

    // Parameterized constructor to initialize Employee object
    public Employee(int empId, String empName, String empDesignation, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    // Overriding toString() to display employee details
    @Override
    public String toString() {
        return "Employee Information:\n" +
               "EmpID: " + empId + "\n" +
               "Name: " + empName + "\n" +
               "Designation: " + empDesignation + "\n" +
               "Salary: " + empSalary;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "John Doe", "Software Developer", 75000.50);

        // Displaying Employee details using toString()
        System.out.println(emp);
    }
}

