/*
 *  Write a program to accept a string as command line argument and check whether it is a file or 
 directory. Also perform operations as follows:
 i)If it is a directory,delete all text files in that directory. Confirm delete operation from
 user before deleting text files. Also, display a count showing the number of files deleted,
 if any, from the directory.
 ii)If it is a file display various details of that file
 */
package Sem_5_slips;

import java.io.File;
import java.util.Scanner;

public class slip_27_2 {

    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileDirectoryCheck <file-or-directory-path>");
            return;
        }

        String path = args[0];
        File file = new File(path);

        // Check if the path is a file or directory
        if (file.isDirectory()) {
            System.out.println("It is a directory.");
            deleteTextFiles(file);
        } else if (file.isFile()) {
            System.out.println("It is a file.");
            displayFileDetails(file);
        } else {
            System.out.println("The specified path does not exist.");
        }
    }

    // Method to delete text files in the given directory
    private static void deleteTextFiles(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            int deletedCount = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Are you sure you want to delete all text files in this directory? (yes/no): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("yes")) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                            deletedCount++;
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
                System.out.println("Total text files deleted: " + deletedCount);
            } else {
                System.out.println("Delete operation cancelled.");
            }
            scanner.close();
        }
    }

    // Method to display details of the specified file
    private static void displayFileDetails(File file) {
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + file.lastModified());
    }
}

