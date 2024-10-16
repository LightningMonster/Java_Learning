/*
    Write a program to print an array after changing the rows and columns of a given 
 two-dimensional array.
*/

import java.util.Scanner;

public class slip_4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of rows and columns from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Accept matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, rows, cols);

        // Create a new matrix for the transposed version
        int[][] transposedMatrix = new int[cols][rows];

        // Transpose the matrix by swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Display the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix, cols, rows);

        // Close the scanner
        scanner.close();
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

/*
 * Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the matrix:
1 2 3
4 5 6

 */