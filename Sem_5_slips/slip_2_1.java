package Sem_5_slips;

// Abstract class Staff
abstract class Staff {
    protected int id;
    protected String name;

    // Parameterized constructor
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

// Subclass OfficeStaff with department member
class OfficeStaff extends Staff {
    private String department;

    // Constructor for OfficeStaff
    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Override method to display details
    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class slip_2_1 {

    public static void main(String[] args) {
        // Check if enough arguments are provided
        if (args.length != 4) {
            System.out.println("Usage: java BMICalculator <FirstName> <LastName> <WeightInKgs> <HeightInMeters>");
            return;
        }

        // Read inputs from command line arguments
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);  // Weight in kg
        double height = Double.parseDouble(args[3]);  // Height in meters

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the result
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.printf("BMI: %.2f\n", bmi);
        
        // Provide BMI category information
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("BMI Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("BMI Category: Overweight");
        } else {
            System.out.println("BMI Category: Obese");
        }
    }
}

/* java BMICalculator John Doe 70 1.75
    Name: John Doe
Weight: 70.0 kg
Height: 1.75 meters
BMI: 22.86
BMI Category: Normal weight
*/