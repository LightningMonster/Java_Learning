/*
 *  Write a menu driven program to perform the following operations on multidimensional array
 ie matrices :
 Addition
 Multiplication
 Exit
 */
package Sem_5_slips;

import java.util.Scanner;

public class slip_5_2 {
    // Method for matrix addition
    static void addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method for matrix multiplication
    static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int cols1, int cols2) {
        int[][] result = new int[rows1][cols2];
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method with menu-driven program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        // Input dimensions for the matrices
        System.out.print("Enter number of rows for the matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for the matrices: ");
        int cols = sc.nextInt();

        // Initialize two matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Menu-driven part of the program
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Addition of Matrices");
            System.out.println("2. Multiplication of Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Perform matrix addition
                    addMatrices(matrix1, matrix2, rows, cols);
                    break;

                case 2:
                    // Perform matrix multiplication
                    if (cols != rows) {
                        System.out.println("Multiplication not possible! Number of columns of first matrix must be equal to number of rows of second matrix.");
                    } else {
                        multiplyMatrices(matrix1, matrix2, rows, cols, cols);
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
