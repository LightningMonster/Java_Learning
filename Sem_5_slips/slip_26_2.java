/*
 * Define a class ‘Donor’ to store the below mentioned details of a blood donor. name, age, 
 address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects of this class for
 all the regular donors at Pune. Write these objects to a file. Read these objects from the file and 
 display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the
 recent six months.
 */
package Sem_5_slips;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Donor implements Serializable { // Implement Serializable
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String name;
    private int age;
    private String address;
    private String contactNumber;
    private String bloodGroup;
    private Date lastDonation;

    // Constructor
    public Donor(String name, int age, String address, String contactNumber, String bloodGroup, Date lastDonation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.lastDonation = lastDonation;
    }

    // Getters
    public String getBloodGroup() {
        return bloodGroup;
    }

    public Date getLastDonation() {
        return lastDonation;
    }

    // Method to display donor details
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Date of Last Donation: " + sdf.format(lastDonation));
        System.out.println();
    }
}

public class slip_26_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of donors: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Donor[] donors = new Donor[n];

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Read donor details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for donor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();
            System.out.print("Blood Group: ");
            String bloodGroup = scanner.nextLine();
            System.out.print("Date of Last Donation (dd/MM/yyyy): ");
            Date lastDonation = null;
            while (lastDonation == null) {
                String dateInput = scanner.nextLine();
                try {
                    lastDonation = sdf.parse(dateInput);
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
                }
            }

            donors[i] = new Donor(name, age, address, contactNumber, bloodGroup, lastDonation);
        }

        // Write donors to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("donors.dat"))) {
            oos.writeObject(donors);
            System.out.println("Donors written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read donors from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("donors.dat"))) {
            Donor[] readDonors = (Donor[]) ois.readObject();
            System.out.println("Donors with Blood Group 'A+ve' who haven't donated in the last 6 months:");

            Date sixMonthsAgo = new Date(System.currentTimeMillis() - 6L * 30 * 24 * 60 * 60 * 1000); // 6 months in milliseconds
            for (Donor donor : readDonors) {
                if (donor.getBloodGroup().equals("A+ve") && donor.getLastDonation().before(sixMonthsAgo)) {
                    donor.displayDetails();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

