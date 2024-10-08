/*
 * Write program to define class Person with data member as Personname,Aadharno, Panno.
 Accept information for 5 objects and display appropriate information (use this keyword).
 */
package Sem_5_slips;

import java.util.Scanner;

class Person {
    private String personName;
    private String aadharNo;
    private String panNo;

    // Constructor
    public Person(String personName, String aadharNo, String panNo) {
        this.personName = personName;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Person Name: " + this.personName);
        System.out.println("Aadhar Number: " + this.aadharNo);
        System.out.println("PAN Number: " + this.panNo);
        System.out.println("---------------------------------");
    }
}

public class slip_30_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5]; // Array to store 5 Person objects

        // Accepting information for 5 Person objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Aadhar Number: ");
            String aadharNo = scanner.nextLine();

            System.out.print("PAN Number: ");
            String panNo = scanner.nextLine();

            // Creating a new Person object and storing it in the array
            persons[i] = new Person(name, aadharNo, panNo);
            System.out.println("---------------------------------");
        }

        // Displaying the information of all persons
        System.out.println("Person Information:");
        for (Person person : persons) {
            person.displayInfo();
        }

        // Closing the scanner
        scanner.close();
    }
}
