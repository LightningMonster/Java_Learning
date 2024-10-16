/*
 * Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information
 */
package practice;
import java.util.Scanner;

class patient{
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    public patient(String patient_name, int patient_age, int patient_oxy_level, int patient_HRCT_report){
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_oxy_level = patient_oxy_level;
        this.patient_HRCT_report = patient_HRCT_report;
    }
}

class CovidPositiveException extends Exception{
    public CovidPositiveException(String message) {
        super(message);
    }
}

public class s_3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name of the Patient: ");
        String name = s.nextLine();

        System.out.print("Enter age of the Patient: ");
        int age = s.nextInt();
        s.nextLine();

        System.out.print("Enter Oxygen lvl of the Patient: ");
        int oxy = s.nextInt();
        s.nextLine();

        System.out.print("Enter HRCT of the Patient: ");
        int HRCT = s.nextInt();
        s.nextLine();

        patient p = new patient(name, age, oxy, HRCT);
        s.close();
        
        try{
            if(p.patient_oxy_level < 95 && p.patient_HRCT_report > 10){
                throw new CovidPositiveException("Patient is Covid Positive(+) and Need to Hospitalized");
            }
            else
            {
                System.out.printf("Name: %c\nAge: %d\nOxygen Level: %d\nHRCT: %d",p.patient_name,p.patient_age,p.patient_oxy_level,p.patient_HRCT_report);
            }
        }
        catch(CovidPositiveException e){
            System.out.println(e.getMessage());
        }

        
    }
}
