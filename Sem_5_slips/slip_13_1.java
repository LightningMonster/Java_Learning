/*
 * Write a program to accept a file name from command prompt, if the file exits then display 
 number of words and lines in that file.
 */
package Sem_5_slips;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class slip_13_1 {
    public static void main(String[] args) {
        // Check if a filename has been provided
        if (args.length < 1) {
            System.out.println("Please provide a filename as a command line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("The file '" + fileName + "' does not exist.");
            return;
        }

        // Initialize counters
        int lineCount = 0;
        int wordCount = 0;

        // Read the file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++; // Increment line count
                String[] words = line.trim().split("\\s+"); // Split line into words
                wordCount += words.length; // Increment word count
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Display the counts
        System.out.println("The file '" + fileName + "' contains:");
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}

//Output: java CountWordsAndLines example.txt
