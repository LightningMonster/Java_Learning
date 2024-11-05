/*
 * Write a program to define a class Account having members custname, accno. Define default 
 and parameterized constructor. Create a subclass called SavingAccount with member savingbal, 
 minbal. Create a derived class AccountDetail that extends the class SavingAccount with 
 members, depositamt and withdrawalamt. Write a appropriate method to display customer 
 details.
*/

// Base class Account
class Account {
    String custName;
    int accNo;

    // Default constructor
    public Account() {
        custName = "Unknown";
        accNo = 0;
    }

    // Parameterized constructor
    public Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }
}

// Subclass SavingAccount that extends Account
class SavingAccount extends Account {
    double savingBal;
    double minBal;

    // Default constructor
    public SavingAccount() {
        super();  // Calls default constructor of Account
        this.savingBal = 0.0;
        this.minBal = 1000.0;  // Minimum balance set to 1000 by default
    }

    // Parameterized constructor
    public SavingAccount(String custName, int accNo, double savingBal, double minBal) {
        super(custName, accNo);  // Calls parameterized constructor of Account
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

// Derived class AccountDetail that extends SavingAccount
class AccountDetail extends SavingAccount {
    double depositAmt;
    double withdrawalAmt;

    // Default constructor
    public AccountDetail() {
        super();  // Calls default constructor of SavingAccount
        this.depositAmt = 0.0;
        this.withdrawalAmt = 0.0;
    }

    // Parameterized constructor
    public AccountDetail(String custName, int accNo, double savingBal, double minBal, double depositAmt, double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal);  // Calls parameterized constructor of SavingAccount
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    // Method to display account details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
        System.out.println("-------------------------------");
    }
}

// Main class to test the program
public class slip_15_2 {
    public static void main(String[] args) {
        // Creating an AccountDetail object with parameterized constructor
        AccountDetail accDetail = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 1000.0);

        // Displaying customer details
        accDetail.displayCustomerDetails();
    }
}

