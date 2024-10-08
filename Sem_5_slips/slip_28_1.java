/*
 * Write a program that reads on file name from the user, then displays information about 
 whether the file exists, whether the file is readable, whether the file is writable, the type of 
 file and the length of the file in bytes.
 */
package Sem_5_slips;

import java.io.File;
import java.util.Scanner;

public class slip_28_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read file name from the user
        System.out.print("Enter the file name (with path if not in the current directory): ");
        String fileName = scanner.nextLine();
        
        // Create a File object
        File file = new File(fileName);
        
        // Check if the file exists
        if (file.exists()) {
            System.out.println("File Information:");
            System.out.println("File Exists: " + file.exists());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Type: " + (file.isDirectory() ? "Directory" : "File"));
            System.out.println("File Length: " + file.length() + " bytes");
        } else {
            System.out.println("The specified file does not exist.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

