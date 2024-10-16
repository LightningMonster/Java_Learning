/*
Q1) Write a program to read the First Name and Last Name of a person, his weight and height using 
 command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
 divided by the square of their height.
 (Hint : BMI = Wts. In kgs / (ht)2)

 */
package Sem_5_slips;
public class slip_2_1 {

    public static void main(String[] args) {
        // Check if enough arguments are provided
        if (args.length != 4) {
            System.out.println("Usage: java BMICalculator <FirstName> <LastName> <WeightInKgs> <HeightInMeters>");
            return;
        }

        // Read inputs from command line arguments
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);  // Weight in kg
        double height = Double.parseDouble(args[3]);  // Height in meters

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the result
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.printf("BMI: %.2f\n", bmi);
        
        // Provide BMI category information
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("BMI Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("BMI Category: Overweight");
        } else {
            System.out.println("BMI Category: Obese");
        }
    }
}

/* java BMICalculator John Doe 70 1.75
    Name: John Doe
Weight: 70.0 kg
Height: 1.75 meters
BMI: 22.86
BMI Category: Normal weight
*/