/*
 *  Write a program to accept the username and password from user if username and password are
not same then raise "Invalid Password" with appropriate msg.
 */
package Sem_5_slips;

import java.util.Scanner;

// Custom Exception for Invalid Password
class InvalidPasswordException extends Exception {
    // Constructor with error message
    public InvalidPasswordException(String message) {
        super(message);
    }
}

// Main class for User Login
public class slip_11_2 {
    // Method to check the username and password
    public static void validateLogin(String username, String password) throws InvalidPasswordException {
        // If username and password are not the same, throw an exception
        if (!username.equals(password)) {
            throw new InvalidPasswordException("Invalid Password: Username and Password do not match.");
        } else {
            System.out.println("Login successful! Username and Password are valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept username and password from the user
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Try to validate login and handle exceptions
        try {
            validateLogin(username, password);  // Call method to check username and password
        } catch (InvalidPasswordException e) {
            // Handle InvalidPasswordException
            System.out.println(e.getMessage());
        }
    }
}

