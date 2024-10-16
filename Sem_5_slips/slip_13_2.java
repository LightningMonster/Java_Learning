/*
 * Write a program to display the system date and time in various formats shown below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
 */
package Sem_5_slips;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class slip_13_2 {
    public static void main(String[] args) {
        // Get current date and time
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define various date and time formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE MMMM dd yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEE MMMM dd HH:mm:ss z yyyy");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a Z");

        // Display current date in various formats
        System.out.println("Current date is : " + currentDate.format(format1));
        System.out.println("Current date is : " + currentDate.format(format2));
        System.out.println("Current date is : " + currentDate.format(format3));

        // Get the current date and time with time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // Display current date and time in various formats
        System.out.println("Current date and time is : " + zonedDateTime.format(format4));
        System.out.println("Current date and time is : " + zonedDateTime.format(format5));
    }
}


