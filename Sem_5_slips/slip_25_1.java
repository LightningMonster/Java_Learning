/*
 *  Create a class Student(rollno, name ,class, per), to read student information from the console 
 and display them (Using BufferedReader class) 
 */

package Sem_5_slips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    private int rollNo;
    private String name;
    private String studentClass;
    private float percentage;

    // Constructor to initialize Student object
    public Student(int rollNo, String name, String studentClass, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("-----------------------------");
    }
}

public class slip_25_1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter number of students: ");
            int n = Integer.parseInt(reader.readLine());

            // Array to hold Student objects
            Student[] students = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");

                System.out.print("Roll No: ");
                int rollNo = Integer.parseInt(reader.readLine());

                System.out.print("Name: ");
                String name = reader.readLine();

                System.out.print("Class: ");
                String studentClass = reader.readLine();

                System.out.print("Percentage: ");
                float percentage = Float.parseFloat(reader.readLine());

                // Create a new Student object and store it in the array
                students[i] = new Student(rollNo, name, studentClass, percentage);
            }

            // Displaying student information
            System.out.println("\nStudent Information:");
            for (Student student : students) {
                student.displayInfo();
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values for roll number and percentage.");
        }
    }
}

