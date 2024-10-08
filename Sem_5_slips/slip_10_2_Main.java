/*
 * Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
 rollno, name, class and marks of 6 subject from user.
 */
package Sem_5_slips;

import Sem_5_slips.slip_10_2_StudentInfo;
import Sem_5_slips.slip_10_2_StudentPer;
import java.util.Scanner;

public class slip_10_2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter Student Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Class: ");
        String studentClass = scanner.nextLine();

        // Accept marks for 6 subjects
        int[] marks = new int[6];
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Create an object of StudentPer to calculate percentage
        slip_10_2_StudentPer studentPer = new slip_10_2_StudentPer(marks);
        double percentage = studentPer.calculatePercentage();

        // Create an object of StudentInfo to display student information
        slip_10_2_StudentInfo studentInfo = new slip_10_2_StudentInfo(rollNo, name, studentClass, percentage);
        studentInfo.displayStudentInfo();
    }
}

