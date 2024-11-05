/*
 * Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). 
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order.
 */

 import java.util.Arrays;
 import java.util.Scanner;
 
 // Class representing a cricket player
 class CricketPlayer {
     String name;
     int innings, notOut, totalRuns;
     double avg;
 
     // Constructor to initialize player details
     CricketPlayer(String name, int innings, int notOut, int totalRuns) {
         this.name = name;
         this.innings = innings;
         this.notOut = notOut;
         this.totalRuns = totalRuns;
         this.avg = calculateAvg();
     }
 
     // Method to calculate batting average
     double calculateAvg() {
         if (innings - notOut > 0) {
             return (double) totalRuns / (innings - notOut);
         }
         return 0.0;
     }
 
     // Static method to sort players by average
     static void sortByAverage(CricketPlayer[] players) {
         Arrays.sort(players, (p1, p2) -> Double.compare(p1.avg, p2.avg));
     }
 
     // Method to display player details
     void display() {
         System.out.printf("Name: %s, Average: %.2f\n", name, avg);
     }
 }
 
 public class slip_2_2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter number of players: ");
         int n = sc.nextInt();
         CricketPlayer[] players = new CricketPlayer[n];
 
         for (int i = 0; i < n; i++) {
             System.out.println("Enter details for Player " + (i + 1));
             System.out.print("Name: ");
             String name = sc.next();
             System.out.print("Innings: ");
             int innings = sc.nextInt();
             System.out.print("Not Out: ");
             int notOut = sc.nextInt();
             System.out.print("Total Runs: ");
             int totalRuns = sc.nextInt();
             players[i] = new CricketPlayer(name, innings, notOut, totalRuns);
         }
 
         CricketPlayer.sortByAverage(players);
 
         System.out.println("Players sorted by batting average:");
         for (CricketPlayer player : players) {
             player.display();
         }
     }
 }
 