/*
 * Accept the names of two files and copy the contents of the first to the second. First file having
Book name and Author name in file. 
 */
package Sem_5_slips;
import java.io.*;
import java.util.Scanner;

public class slip_15_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the names of the two files
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();

        // Try to copy the contents of the first file to the second file
        try {
            File sourceFile = new File(sourceFileName);
            File destinationFile = new File(destinationFileName);

            // Check if the source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Create streams for reading and writing
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close the streams
            reader.close();
            writer.close();

            System.out.println("File copied successfully from " + sourceFileName + " to " + destinationFileName);

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
