/*
 * Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). 
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order.
 */
package Sem_5_slips;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Class representing a cricket player
class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalRuns;
    double bat_avg;

    // Constructor to initialize player details
    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalRuns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalRuns = totalRuns;
        this.bat_avg = avg();
    }

    // Static method to calculate batting average
    public double avg() {
        if (no_of_innings - no_of_times_notout > 0) {
            return (double) totalRuns / (no_of_innings - no_of_times_notout);
        } else {
            return 0.0; // To handle cases where there are no innings
        }
    }

    // Static method to sort players based on batting average
    public static void sortByAverage(CricketPlayer[] players) {
        Arrays.sort(players, Comparator.comparingDouble(p -> p.bat_avg));
    }

    // Method to display player details
    public void displayDetails() {
        System.out.printf("Name: %s, Innings: %d, Not Out: %d, Total Runs: %d, Batting Average: %.2f\n",
                name, no_of_innings, no_of_times_notout, totalRuns, bat_avg);
    }
}

public class slip_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Create an array of CricketPlayer objects
        CricketPlayer[] players = new CricketPlayer[n];

        // Input details for each player
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter details for Player %d:\n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Innings: ");
            int no_of_innings = scanner.nextInt();
            System.out.print("Number of Times Not Out: ");
            int no_of_times_notout = scanner.nextInt();
            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Create CricketPlayer object
            players[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, totalRuns);
        }

        // Sort players by batting average
        CricketPlayer.sortByAverage(players);

        // Display sorted player details
        System.out.println("\nPlayer Details in Sorted Order by Batting Average:");
        for (CricketPlayer player : players) {
            player.displayDetails();
        }

        scanner.close();
    }
}

/*
 * Enter the number of players: 3
Enter details for Player 1:
Name: John
Number of Innings: 10
Number of Times Not Out: 2
Total Runs: 400
Enter details for Player 2:
Name: Alice
Number of Innings: 12
Number of Times Not Out: 3
Total Runs: 600
Enter details for Player 3:
Name: Bob
Number of Innings: 8
Number of Times Not Out: 1
Total Runs: 300

Player Details in Sorted Order by Batting Average:
Name: Bob, Innings: 8, Not Out: 1, Total Runs: 300, Batting Average: 42.86
Name: John, Innings: 10, Not Out: 2, Total Runs: 400, Batting Average: 50.00
Name: Alice, Innings: 12, Not Out: 3, Total Runs: 600, Batting Average: 60.00

 */