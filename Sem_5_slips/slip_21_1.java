/*
 * Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject. 
 Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date
 is invalid.

 */
package Sem_5_slips;

import java.util.Scanner;

// User-defined exception for invalid dates
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// Class to represent a date
public class slip_21_1 {
    private int day;
    private int month;
    private int year;

    // Method to accept date
    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");
        
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to display date
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    // Method to validate date
    private boolean isValidDate(int day, int month, int year) {
        // Check for valid month
        if (month < 1 || month > 12) {
            return false;
        }

        // Check for valid day based on month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check for leap year
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day >= 1 && day <= daysInMonth[month];
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Main method to test the class
    public static void main(String[] args) {
        slip_21_1 myDate = new slip_21_1();
        try {
            myDate.acceptDate();
            myDate.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
