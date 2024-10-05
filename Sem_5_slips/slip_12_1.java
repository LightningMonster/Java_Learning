/*
 * Write a program to create parent class College(cno, cname, caddr) and derived class 
Department(dno, dname) from College. Write a necessary methods to display College details.
 */
package Sem_5_slips;

// Parent class College
class College {
    protected int cno;        // College number
    protected String cname;   // College name
    protected String caddr;   // College address

    // Parameterized constructor for College
    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    // Method to display College details
    public void displayCollegeDetails() {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

// Derived class Department
class Department extends College {
    private int dno;         // Department number
    private String dname;    // Department name

    // Parameterized constructor for Department
    public Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr); // Call the constructor of College
        this.dno = dno;
        this.dname = dname;
    }

    // Method to display Department details
    public void displayDepartmentDetails() {
        displayCollegeDetails();  // Call method from College to display college details
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

// Main class to run the program
public class slip_12_1 {
    public static void main(String[] args) {
        // Create an instance of Department
        Department department = new Department(101, "ABC College", "123 College St.", 202, "Computer Science");

        // Display the details of the College and Department
        System.out.println("College and Department Details:");
        department.displayDepartmentDetails();
    }
}

