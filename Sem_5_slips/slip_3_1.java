/*
 *  Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.
 */

import java.util.Arrays;
import java.util.Scanner;

public class slip_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of cities
        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the city names
        String[] cities = new String[n];

        // Accept city names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }

        // Sort the array of city names in ascending order
        Arrays.sort(cities);

        // Display the sorted city names
        System.out.println("\nCities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Close the scanner
        scanner.close();
    }
}

/*
 * Enter the number of cities: 3
Enter the name of city 1: New York
Enter the name of city 2: Los Angeles
Enter the name of city 3: Chicago

Cities in ascending order:
Chicago
Los Angeles
New York

 */