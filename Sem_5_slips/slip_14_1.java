/*
 * Write a program to accept a number from the user, if number is zero then throw user defined 
 exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
 */

import java.util.Scanner;

// User-defined exception class
class ZeroNumberException extends Exception {
    public ZeroNumberException(String message) {
        super(message);
    }
}

public class slip_14_1 {

    // Static method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new ZeroNumberException("Number is 0");
            } else {
                // Check if the number is prime
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } catch (ZeroNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

