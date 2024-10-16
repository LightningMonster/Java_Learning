package pack_10;
//Call the dir where your program is located

public class slip_10_2_StudentInfo {
    private int rollNo;
    private String name;
    private String studentClass;
    private double percentage;

    // Constructor to initialize the student information
    public slip_10_2_StudentInfo(int rollNo, String name, String studentClass, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Class: " + studentClass);
        System.out.println("Student Percentage: " + percentage + "%");
    }
}
