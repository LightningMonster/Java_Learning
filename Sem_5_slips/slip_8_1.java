/*
 * Create a class Sphere, to calculate the volume and surface area of sphere.
 (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
 */

package Sem_5_slips;

import java.util.Scanner;

// Sphere class definition
class Sphere {
    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate the surface area of the sphere
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Method to calculate the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    // Method to display the calculated values
    public void display() {
        System.out.println("Sphere Radius: " + radius);
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}

// Main class to test the Sphere class
public class slip_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept the radius from the user
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        // Create a Sphere object
        Sphere sphere = new Sphere(radius);

        // Display the results
        sphere.display();

        sc.close();
    }
}

