/*
Define a class MyNumber having one private int data member. Write a default constructor to 
 initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods 
 isNegative, isPositive, isZero, isOdd, isEven. Create an object in main.Use command line 
 arguments to pass a value to the Object.
*/

package Sem_5_slips;

public class slip_23_1 {
    private int data;

    // Default constructor to initialize data to 0
    public slip_23_1() {
        this.data = 0;
    }

    // Parameterized constructor to initialize data to a specific value
    public slip_23_1(int data) {
        this.data = data;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return data < 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return data > 0;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return data == 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return data % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return data % 2 == 0;
    }

    // Main method
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length > 0) {
            try {
                // Parse the command line argument as an integer
                int inputNumber = Integer.parseInt(args[0]);
                slip_23_1 myNumber = new slip_23_1(inputNumber);

                // Display the results
                System.out.println("Number: " + inputNumber);
                System.out.println("Is Negative: " + myNumber.isNegative());
                System.out.println("Is Positive: " + myNumber.isPositive());
                System.out.println("Is Zero: " + myNumber.isZero());
                System.out.println("Is Odd: " + myNumber.isOdd());
                System.out.println("Is Even: " + myNumber.isEven());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}
