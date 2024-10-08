/*
Write a program to accept the two dimensional array from user and display sum of its diagonal 
 elements.
*/
package Sem_5_slips;

import java.util.Scanner;

public class slip_19_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the size of the 2D array
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Creating a two-dimensional array
        int[][] matrix = new int[n][n];

        // Accepting elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating the sum of the diagonal elements
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; // Main diagonal
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal
        }

        // Displaying the results
        System.out.println("Sum of the main diagonal elements: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal elements: " + secondaryDiagonalSum);

        scanner.close();
    }
}

