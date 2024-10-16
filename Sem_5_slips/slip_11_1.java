/*
 * Define an interface “Operation” which has method volume( ).Define a constant PI having a value 
3.142 Create a class cylinder which implements this interface (members – radius,height). Create 
one object and calculate the volume.
 */

// Define the Operation interface
interface Operation {
    double PI = 3.142;  // Constant PI

    // Abstract method for calculating volume
    double volume();
}

// Cylinder class implementing the Operation interface
class Cylinder implements Operation {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implementing the volume() method from the Operation interface
    @Override
    public double volume() {
        return PI * radius * radius * height;  // Volume of cylinder formula: π * r^2 * h
    }

    // Method to display cylinder details
    public void displayVolume() {
        System.out.println("Radius of Cylinder: " + radius);
        System.out.println("Height of Cylinder: " + height);
        System.out.println("Volume of Cylinder: " + volume());
    }
}

// Main class
public class slip_11_1 {
    public static void main(String[] args) {
        // Accept radius and height for the cylinder from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create a Cylinder object and calculate its volume
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.displayVolume();  // Display the volume of the cylinder
    }
}

