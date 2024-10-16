/*
 *  Define an Employee class with suitable attributes having getSalary() method, which returns
 salary withdrawn by a particular employee. Write a class Manager which extends a class
 Employee, override the getSalary() method, which will return salary of manager by adding
 traveling allowance, house rent allowance etc. 
 */
package Sem_5_slips;

class Employee {
    // Attributes for Employee
    private String name;
    private String position;
    private double baseSalary;

    // Constructor
    public Employee(String name, String position, double baseSalary) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    // Method to get the salary of the employee
    public double getSalary() {
        return baseSalary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + getSalary());
    }
}

class Manager extends Employee {
    // Additional attributes for Manager
    private double travelingAllowance;
    private double houseRentAllowance;

    // Constructor
    public Manager(String name, double baseSalary, double travelingAllowance, double houseRentAllowance) {
        super(name, "Manager", baseSalary); // Call Employee constructor
        this.travelingAllowance = travelingAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    // Override getSalary() method
    @Override
    public double getSalary() {
        return super.getSalary() + travelingAllowance + houseRentAllowance;
    }

    // Method to display manager details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Employee displayInfo
        System.out.println("Traveling Allowance: $" + travelingAllowance);
        System.out.println("House Rent Allowance: $" + houseRentAllowance);
        System.out.println("Total Salary: $" + getSalary());
    }
}

public class slip_27_1 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("Alice", "Developer", 60000);
        System.out.println("Employee Details:");
        employee.displayInfo();
        
        System.out.println("\nManager Details:");
        // Creating a Manager object
        Manager manager = new Manager("Bob", 80000, 5000, 2000);
        manager.displayInfo();
    }
}

