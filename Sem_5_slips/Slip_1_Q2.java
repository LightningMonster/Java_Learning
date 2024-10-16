/*
* Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details.
*/
package Sem_5_slips;

import java.util.Scanner;
// Abstract class Staff
abstract class Staff {
    protected int id;
    protected String name;
    // Parameterized constructor
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Abstract method to display details
    public abstract void displayDetails();
}
// Subclass OfficeStaff with department member
class OfficeStaff extends Staff {
    private String department;
    // Constructor for OfficeStaff
    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
    // Override method to display details
    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}
public class Slip_1_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of OfficeStaff members: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
// Create an array of OfficeStaff objects
        OfficeStaff[] staffMembers = new OfficeStaff[n];
// Input details for each OfficeStaff object
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for OfficeStaff member " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
// Create OfficeStaff object
            staffMembers[i] = new OfficeStaff(id, name, department);
        }
// Display details of all OfficeStaff members
        System.out.println("\nOfficeStaff Details:");
        for (OfficeStaff staff : staffMembers) {
            staff.displayDetails();
        }
        scanner.close();
    }
}