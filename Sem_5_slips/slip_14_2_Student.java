/*
 * Write a Java program to create a Package “SY” which has a class SYMarks (members –
 ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a
 class TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having
 rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects
 and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40 
 else‘FAIL’) and display the result of the student in proper format.
 */
package Sem_5_slips;

import Sem_5_slips.slip_14_2_SYMarks;
import Sem_5_slips.slip_14_2_TYMarks;
import java.util.Scanner;

public class slip_14_2_Student {
    private int rollNumber;
    private String name;
    private slip_14_2_SYMarks syMarks;
    private slip_14_2_TYMarks tyMarks;

    // Constructor
    public slip_14_2_Student(int rollNumber, String name, slip_14_2_SYMarks syMarks, slip_14_2_TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    // Method to calculate the grade based on computer subject marks from SY and TY
    public String calculateGrade() {
        int totalComputerMarks = syMarks.getTotal() + tyMarks.getTotal();
        if (totalComputerMarks >= 70) {
            return "A";
        } else if (totalComputerMarks >= 60) {
            return "B";
        } else if (totalComputerMarks >= 50) {
            return "C";
        } else if (totalComputerMarks >= 40) {
            return "Pass Class";
        } else {
            return "FAIL";
        }
    }

    // Method to display the result of the student
    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("SY Computer Marks: " + syMarks.getComputerTotal());
        System.out.println("TY Theory Marks: " + tyMarks.getTheory());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        slip_14_2_Student[] students = new slip_14_2_Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("SY Computer Marks: ");
            int syComputerMarks = scanner.nextInt();
            System.out.print("SY Maths Marks: ");
            int syMathsMarks = scanner.nextInt();
            System.out.print("SY Electronics Marks: ");
            int syElectronicsMarks = scanner.nextInt();

            System.out.print("TY Theory Marks: ");
            int tyTheoryMarks = scanner.nextInt();
            System.out.print("TY Practical Marks: ");
            int tyPracticalMarks = scanner.nextInt();

            slip_14_2_SYMarks syMarks = new slip_14_2_SYMarks(syComputerMarks, syMathsMarks, syElectronicsMarks);
            slip_14_2_TYMarks tyMarks = new slip_14_2_TYMarks(tyTheoryMarks, tyPracticalMarks);

            students[i] = new slip_14_2_Student(rollNumber, name, syMarks, tyMarks);
        }

        System.out.println("\nStudent Results:");
        for (slip_14_2_Student student : students) {
            student.displayResult();
        }

        scanner.close();
    }
}
