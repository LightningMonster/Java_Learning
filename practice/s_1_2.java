/*
* Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details.
*/

package practice;

import java.util.Scanner;

abstract class Staff{
    protected int id;
    protected String name;

    public Staff(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

class OfficeStaff extends Staff{
    private String department;

    public OfficeStaff(int id, String name, String department)
    {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("ID: "+id+" Name: "+name+" Department: "+department);
    }
}

public class s_1_2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of OfficeStaff Members: ");
        int n = s.nextInt();
        s.nextLine();

        OfficeStaff[] staffMembers = new OfficeStaff[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter details for staff member "+(i+1));
            System.err.print("Enter ID: ");
            int id = s.nextInt();
            s.nextLine();
            System.err.print("Enter Name: ");
            String name = s.nextLine();
            System.err.print("Enter Department: ");
            String department = s.nextLine();

            staffMembers[i] = new OfficeStaff(id, name, department);
        }

        for(OfficeStaff staff: staffMembers)
        {
            staff.displayDetails();
        }
        s.close();
    }
}