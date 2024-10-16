/*
 * Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
 rollno, name, class and marks of 6 subject from user.
 */
package Sem_5_slips; //Call the dir where your program is located

public class slip_10_2_StudentPer {
    private int[] marks = new int[6];

    // Constructor to accept marks
    public slip_10_2_StudentPer(int[] marks) {
        this.marks = marks;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        // Total marks for 6 subjects
        return (totalMarks / 600.0) * 100;
    }
}

