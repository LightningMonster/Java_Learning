/*
 * Define a “Clock” class that does the following ; 
 a. Accept Hours, Minutes and Seconds
 b. Check the validity of numbers
 c. Set the time to AM/PM mode
 Use the necessary constructors and methods to do the above task 
 */
package Sem_5_slips;

import java.util.Scanner;

// Clock class definition
class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String period; // AM/PM mode

    // Constructor to initialize the clock with hours, minutes, and seconds
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to check if the time is valid
    public boolean isValidTime() {
        if (hours < 0 || hours > 23) {
            return false;
        }
        if (minutes < 0 || minutes > 59) {
            return false;
        }
        if (seconds < 0 || seconds > 59) {
            return false;
        }
        return true;
    }

    // Method to set time in AM/PM mode
    public void setAMPMMode() {
        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours -= 12;
            }
        } else {
            period = "AM";
            if (hours == 0) {
                hours = 12;
            }
        }
    }

    // Method to display the time
    public void displayTime() {
        System.out.printf("The time is: %02d:%02d:%02d %s\n", hours, minutes, seconds, period);
    }

    // Method to set the time manually
    public static Clock setTime() {
        Scanner scanner = new Scanner(System.in);

        // Accept hours, minutes, and seconds from the user
        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds (0-59): ");
        int seconds = scanner.nextInt();

        // Create a Clock object
        Clock clock = new Clock(hours, minutes, seconds);

        // Check the validity of the time
        if (!clock.isValidTime()) {
            System.out.println("Invalid time entered!");
            return null;
        }

        return clock;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Set and validate time
        Clock clock = Clock.setTime();

        if (clock != null) {
            // Set to AM/PM mode
            clock.setAMPMMode();
            // Display the time
            clock.displayTime();
        }
    }
}

