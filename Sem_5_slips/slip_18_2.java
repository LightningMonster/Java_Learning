/*
 * Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
 Create an array of n player objects. Calculate the batting average for each player using static
 method avg(). Define a static sort method which sorts the array on the basis of average. 
 Display the player details in sorted order.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;
    private double batAvg;

    // Constructor
    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = avg(); // Calculate batting average
    }

    // Static method to calculate batting average
    public double avg() {
        if (noOfInnings - noOfTimesNotOut > 0) {
            return (double) totalRuns / (noOfInnings - noOfTimesNotOut);
        } else {
            return 0.0; // If the player hasn't batted yet
        }
    }

    // Static method to sort players by batting average
    public static void sortByAverage(CricketPlayer[] players) {
        Arrays.sort(players, new Comparator<CricketPlayer>() {
            @Override
            public int compare(CricketPlayer p1, CricketPlayer p2) {
                return Double.compare(p1.batAvg, p2.batAvg);
            }
        });
    }

    // Method to display player details
    public void display() {
        System.out.printf("Name: %s, Innings: %d, Not Out: %d, Total Runs: %d, Batting Average: %.2f\n",
                name, noOfInnings, noOfTimesNotOut, totalRuns, batAvg);
    }
}

public class slip_18_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CricketPlayer[] players = new CricketPlayer[n];

        // Input player details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Innings: ");
            int noOfInnings = scanner.nextInt();
            System.out.print("Number of Times Not Out: ");
            int noOfTimesNotOut = scanner.nextInt();
            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            players[i] = new CricketPlayer(name, noOfInnings, noOfTimesNotOut, totalRuns);
        }

        // Sort players by batting average
        CricketPlayer.sortByAverage(players);

        // Display player details in sorted order
        System.out.println("\nPlayer Details (Sorted by Batting Average):");
        for (CricketPlayer player : players) {
            player.display();
        }

        scanner.close();
    }
}
