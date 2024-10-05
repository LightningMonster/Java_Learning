package Sem_5_slips;

//import Sem_5_slips.slip_14_2_SYMarks;
//import Sem_5_slips.slip_14_2_TYMarks;
import java.util.Scanner;

public class slip_14_2_Student {
    private int rollNumber;
    private String name;
    private slip_14_2_SYMarks syMarks;
    private slip_14_2_TYMarks tyMarks;

    // Constructor using the correct class names
    public slip_14_2_Student(int rollNumber, String name, slip_14_2_SYMarks syMarks, slip_14_2_TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public String calculateGrade() {
        int totalMarks = syMarks.getComputerTotal() + tyMarks.getTheory(); // Adjust if necessary
        if (totalMarks >= 70) {
            return "A";
        } else if (totalMarks >= 60) {
            return "B";
        } else if (totalMarks >= 50) {
            return "C";
        } else if (totalMarks >= 40) {
            return "Pass Class";
        } else {
            return "FAIL";
        }
    }

    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Computer Marks (SY): " + syMarks.getComputerTotal());
        System.out.println("Theory Marks (TY): " + tyMarks.getTheory());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }

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

            students[i] = new slip_14_2_Student(rollNumber, name, syMarks, tyMarks); // Corrected instantiation
        }

        System.out.println("\nStudent Results:");
        for (slip_14_2_Student student : students) {
            student.displayResult();
        }

        scanner.close();
    }
}
