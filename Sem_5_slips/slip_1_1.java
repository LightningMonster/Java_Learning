/*
Write a Program to print all Prime numbers in an array of ‘n’ elements.
 use command line arguments
 */
package Sem_5_slips;

public class slip_1_1 {

    public static void main(String[] args) {
        // Check if at least one argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an array of integers.");
            return;
        }

        // Iterate through command line arguments and check for prime numbers
        System.out.println("Prime numbers in the provided array:");
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (isPrime(num)) {
                    System.out.println(num);
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}
