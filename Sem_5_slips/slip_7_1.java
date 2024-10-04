/*
 * Design a class for Bank. Bank Class should support following operations; 
 a. Deposit a certain amount into an account
 b. Withdraw a certain amount from an account
 c. Return a Balance value specifying the amount with details
 */
package Sem_5_slips;

import java.util.Scanner;

// Bank class definition
class Bank {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account
    public Bank(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " has been deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " has been withdrawn. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to test the Bank class
public class slip_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a new bank account
        System.out.print("Enter the account holder's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the initial balance: ");
        double initialBalance = sc.nextDouble();

        Bank account = new Bank(name, initialBalance);

        boolean exit = false;

        // Menu-driven operations
        while (!exit) {
            System.out.println("\nBank Operations:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        sc.close();
    }
}

