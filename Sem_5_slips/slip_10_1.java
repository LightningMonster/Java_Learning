/*
 * Write a program to find the cube of given number using functional interface.

 */
package Sem_5_slips;

import java.util.Scanner;
import java.util.function.Function;

public class slip_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define a functional interface using a lambda expression to calculate the cube
        Function<Integer, Integer> cubeFunction = (n) -> n * n * n;

        // Calculate and display the cube of the number
        int cube = cubeFunction.apply(number);
        System.out.println("The cube of " + number + " is: " + cube);
    }
}

