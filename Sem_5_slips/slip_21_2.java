/*
 * Create an employee class(id,name,deptname,salary). Define a default and parameterized 
 constructor. Use ‘this’ keyword to initialize instance variables. Keep a count of objects 
 created. Create objects using parameterized constructor and display the object count after
 each object is created. (Use static member and method). Also display the contents of each 
 object.
 */
package Sem_5_slips;

class slip_21_2 {
    private int id;
    private String name;
    private String deptName;
    private double salary;

    // Static member to count the number of Employee objects created
    private static int count = 0;

    // Default constructor
    public slip_21_2() {
        this.id = 0;
        this.name = "Unknown";
        this.deptName = "Not Assigned";
        this.salary = 0.0;
        count++; // Increment count when an object is created
    }

    // Parameterized constructor
    public slip_21_2(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++; // Increment count when an object is created
    }

    // Static method to get the count of Employee objects created
    public static int getCount() {
        return count;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        slip_21_2 emp1 = new slip_21_2(1, "Alice", "IT", 75000);
        System.out.println("Total Employees: " + slip_21_2.getCount());
        emp1.displayDetails();

        slip_21_2 emp2 = new slip_21_2(2, "Bob", "HR", 60000);
        System.out.println("Total Employees: " + slip_21_2.getCount());
        emp2.displayDetails();

        slip_21_2 emp3 = new slip_21_2(3, "Charlie", "Finance", 80000);
        System.out.println("Total Employees: " + slip_21_2.getCount());
        emp3.displayDetails();

        // Creating an object using the default constructor
        slip_21_2 emp4 = new slip_21_2();
        System.out.println("Total Employees: " + slip_21_2.getCount());
        emp4.displayDetails();
    }
}

