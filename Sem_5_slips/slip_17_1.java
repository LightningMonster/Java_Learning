/*
Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance) 
 from Customer. Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write 
 necessary member functions to read and display the details of ‘n’customers.
*/
package Sem_5_slips;
import java.util.Scanner;

// Superclass Customer
class Customer {
    protected String name;
    protected String phoneNumber;

    // Constructor
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

// Derived class Depositor
class Depositor extends Customer {
    private String accNo;
    private double balance;

    // Constructor
    public Depositor(String name, String phoneNumber, String accNo, double balance) {
        super(name, phoneNumber);
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to display depositor details
    public void displayDepositorDetails() {
        displayCustomerDetails();
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

// Derived class Borrower
class Borrower extends Depositor {
    private String loanNo;
    private double loanAmt;

    // Constructor
    public Borrower(String name, String phoneNumber, String accNo, double balance, String loanNo, double loanAmt) {
        super(name, phoneNumber, accNo, balance);
        this.loanNo = loanNo;
        this.loanAmt = loanAmt;
    }

    // Method to display borrower details
    public void displayBorrowerDetails() {
        displayDepositorDetails();
        System.out.println("Loan Number: " + loanNo);
        System.out.println("Loan Amount: " + loanAmt);
    }
}

// Main class
public class slip_17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Borrower[] borrowers = new Borrower[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for customer " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Account Number: ");
            String accNo = scanner.nextLine();

            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Loan Number: ");
            String loanNo = scanner.nextLine();

            System.out.print("Loan Amount: ");
            double loanAmt = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create a Borrower object
            borrowers[i] = new Borrower(name, phoneNumber, accNo, balance, loanNo, loanAmt);
        }

        System.out.println("\nCustomer Details:");

        for (Borrower borrower : borrowers) {
            borrower.displayBorrowerDetails();
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}
