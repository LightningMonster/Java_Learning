/*
Q1) Write a program to read the First Name and Last Name of a person, his weight and height using 
 command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
 divided by the square of their height.
 (Hint : BMI = Wts. In kgs / (ht)2)

 */

package practice;

public class s_2_1{
    public static void main(String[] args)
    {
        if(args.length != 4)
        {
            System.out.println("Usage: java s_2_1 <FirstName> <LastName> <WeightInKgs> <HeightInMeters>");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);

        double bmi = weight / (height*height);

        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Weight: "+weight+" kgs");
        System.out.println("Height: "+height+" meters");
        System.out.printf("BMI: %.2f\n", bmi);

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