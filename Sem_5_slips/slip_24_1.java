/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and 
 Rs.200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
 are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method 
 by creating an object of each of the three classes.
 */
package Sem_5_slips;

// Abstract class Bank
abstract class Bank {
    // Abstract method to get balance
    public abstract int getBalance();
}

// Subclass BankA
class BankA extends Bank {
    private int balance;

    // Constructor to initialize the balance
    public BankA() {
        this.balance = 100; // Rs. 100 deposited
    }

    // Implementing the getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

// Subclass BankB
class BankB extends Bank {
    private int balance;

    // Constructor to initialize the balance
    public BankB() {
        this.balance = 150; // Rs. 150 deposited
    }

    // Implementing the getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

// Subclass BankC
class BankC extends Bank {
    private int balance;

    // Constructor to initialize the balance
    public BankC() {
        this.balance = 200; // Rs. 200 deposited
    }

    // Implementing the getBalance method
    @Override
    public int getBalance() {
        return balance;
    }
}

// Main class to test the program
public class slip_24_1 {
    public static void main(String[] args) {
        // Creating objects of each bank
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        // Displaying the balances
        System.out.println("Balance in Bank A: Rs. " + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs. " + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs. " + bankC.getBalance());
    }
}

