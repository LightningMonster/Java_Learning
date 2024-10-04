/*
 * Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information
 */

package Sem_5_slips;

import java.util.Scanner;

// Custom exception class for Covid positive patients
class CovidPositiveException extends Exception {
    public CovidPositiveException(String message) {
        super(message);
    }
}

// Patient class with relevant attributes
class Patient {
    private String patientName;
    private int patientAge;
    private int patientOxyLevel; // Oxygen level in percentage
    private int patientHrcReport; // HRCT report score

    // Constructor to initialize patient details
    public Patient(String name, int age, int oxyLevel, int hrcReport) {
        this.patientName = name;
        this.patientAge = age;
        this.patientOxyLevel = oxyLevel;
        this.patientHrcReport = hrcReport;
    }

    // Method to check patient status and display information
    public void checkPatientStatus() throws CovidPositiveException {
        if (patientOxyLevel < 95 && patientHrcReport > 10) {
            throw new CovidPositiveException("Patient is Covid Positive(+) and Needs to be Hospitalized");
        } else {
            displayPatientInfo();
        }
    }

    // Method to display patient information
    private void displayPatientInfo() {
        System.out.println("\nPatient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Patient Oxygen Level: " + patientOxyLevel + "%");
        System.out.println("Patient HRCT Report Score: " + patientHrcReport);
    }
}

public class slip_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting patient details from user
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Patient Oxygen Level (in %): ");
        int oxyLevel = scanner.nextInt();

        System.out.print("Enter Patient HRCT Report Score: ");
        int hrcReport = scanner.nextInt();

        // Create a patient object with user inputs
        Patient patient = new Patient(name, age, oxyLevel, hrcReport);

        // Check patient status and handle exceptions
        try {
            patient.checkPatientStatus();
        } catch (CovidPositiveException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

/*
 * Enter Patient Name: John Doe
Enter Patient Age: 30
Enter Patient Oxygen Level (in %): 94
Enter Patient HRCT Report Score: 12

 */