/*
 *  Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.
 */

package practice;
import java.util.Arrays;
import java.util.Scanner;
public class s_3_1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = s.nextInt();
        s.nextLine();

        String[] Cities = new String[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("Name of City "+(i+1)+": ");
            Cities[i] = s.nextLine();
        }

        System.out.println("Array before sort: ");
        for(int i=0; i<n; i++)
        {
            System.out.println((i+1)+") "+Cities[i]);
        }

        Arrays.sort(Cities);

        System.out.println("Array after sort: ");
        for(int i=0; i<n; i++)
        {
            System.out.println((i+1)+") "+Cities[i]);
        }

        s.close();
    }


}
