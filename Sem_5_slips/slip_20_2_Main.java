/*
 * Write a package for Operation, which has two classes, Addition and Maximum. Addition has 
 two methods add () and subtract (), which are used to add two integers and subtract two,
 float values respectively. Maximum has a method max () to display the maximum of two 
 integers

 */

 
 public class slip_20_2_Main {
     public static void main(String[] args) {
         // Create objects for the classes
         slip_20_2_Addition addition = new slip_20_2_Addition();
         slip_20_2_Maximum maximum = new slip_20_2_Maximum();
 
         // Test Addition class methods
         int sum = addition.add(10, 20);
         float difference = addition.subtract(5.5f, 2.3f);
         System.out.println("Sum of 10 and 20: " + sum);
         System.out.println("Difference of 5.5 and 2.3: " + difference);
 
         // Test Maximum class method
         int maxVal = maximum.max(15, 25);
         System.out.println("Maximum of 15 and 25: " + maxVal);
     }
 }
 
