/*
 * Write a program to accept a text file from user and display the contents of a file in 
 reverse order and change its case.
*/
package Sem_5_slips;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class slip_7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the file path
        System.out.print("Enter the path of the text file: ");
        String filePath = sc.nextLine();
        
        // List to store lines of the file
        List<String> lines = new ArrayList<>();

        try {
            // Create a File object
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            // Read lines from the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.add(line); // Add each line to the list
            }
            fileScanner.close();

            // Reverse the lines and change case
            System.out.println("\nContents of the file in reverse order with changed case:");
            for (int i = lines.size() - 1; i >= 0; i--) {
                String reversedLine = changeCase(lines.get(i));
                System.out.println(reversedLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path and try again.");
        }

        sc.close();
    }

    // Method to change the case of the text
    private static String changeCase(String line) {
        StringBuilder changedCase = new StringBuilder();
        for (char ch : line.toCharArray()) {
            // Change case: uppercase to lowercase and vice versa
            if (Character.isLowerCase(ch)) {
                changedCase.append(Character.toUpperCase(ch));
            } else {
                changedCase.append(Character.toLowerCase(ch));
            }
        }
        return changedCase.toString();
    }
}
