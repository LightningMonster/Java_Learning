/*
 * Write a program to create a super class Vehicle having members Company and price. 
 Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle 
 (capacity_in_tons). Accept the information for "n" vehicles and display the information in 
 appropriate form. While taking data, ask user about the type of vehicle first.
 */
package Sem_5_slips;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    private String company;
    private double price;

    // Constructor
    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    // Getters
    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    // Constructor
    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Light Motor Vehicle");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacityInTons;

    // Constructor
    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Heavy Motor Vehicle");
        System.out.println("Capacity: " + capacityInTons + " tons");
    }
}

public class slip_29_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle type (Light/Heavy): ");
            String vehicleType = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter company name: ");
            String company = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if (vehicleType.equals("light")) {
                System.out.print("Enter mileage (km/l): ");
                double mileage = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                vehicles.add(new LightMotorVehicle(company, price, mileage));
            } else if (vehicleType.equals("heavy")) {
                System.out.print("Enter capacity (tons): ");
                double capacityInTons = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                vehicles.add(new HeavyMotorVehicle(company, price, capacityInTons));
            } else {
                System.out.println("Invalid vehicle type! Please enter either 'Light' or 'Heavy'.");
                i--; // Decrement i to repeat the iteration for invalid input
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("---------------------------------");
            vehicle.display();
            System.out.println("---------------------------------");
        }

        // Close the scanner
        scanner.close();
    }
}

