/*
 *  Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
 Write a method to search the customer name with given contact number and display the 
 details. 
 */
package Sem_5_slips;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    private int custno;
    private String custname;
    private String contactnumber;
    private String custaddr;

    // Constructor
    public Customer(int custno, String custname, String contactnumber, String custaddr) {
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    // Getters
    public String getCustname() {
        return custname;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void displayDetails() {
        System.out.println("Customer Number: " + custno);
        System.out.println("Customer Name: " + custname);
        System.out.println("Contact Number: " + contactnumber);
        System.out.println("Customer Address: " + custaddr);
    }
}

public class slip_29_1 {
    private List<Customer> customers;

    // Constructor to initialize the customer list
    public slip_29_1() {
        customers = new ArrayList<>();
    }

    // Method to add customers
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to search customer by contact number
    public void searchCustomerByContact(String contactnumber) {
        boolean found = false;
        for (Customer customer : customers) {
            if (customer.getContactnumber().equals(contactnumber)) {
                customer.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No customer found with the contact number: " + contactnumber);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        slip_29_1 customerSearch = new slip_29_1();

        // Adding sample customers
        customerSearch.addCustomer(new Customer(1, "Alice", "1234567890", "123 Main St"));
        customerSearch.addCustomer(new Customer(2, "Bob", "0987654321", "456 Park Ave"));

        // Search for a customer
        System.out.print("Enter the contact number to search for a customer: ");
        String contactnumber = scanner.nextLine();

        customerSearch.searchCustomerByContact(contactnumber);

        // Close the scanner
        scanner.close();
    }
}

