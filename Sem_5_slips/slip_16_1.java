/*
 * Write a program to find the Square of given number using function interface. 

 */


import java.util.Scanner;

// Define a functional interface
@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int number);
}

public class slip_16_1 {
    public static void main(String[] args) {
        // Implement the SquareCalculator interface using a lambda expression
        SquareCalculator squareCalculator = (int number) -> number * number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        int inputNumber = scanner.nextInt();

        // Calculate the square using the custom interface
        int result = squareCalculator.calculateSquare(inputNumber);

        // Display the result
        System.out.println("The square of " + inputNumber + " is: " + result);

        scanner.close();
    }
}
