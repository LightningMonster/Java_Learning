//Day 1
//First program

public class Day1{
    public static void main(String[] args){
        System.out.println("Hello World!");

        System.out.println(5);
        System.out.println(50);
        System.out.println(500);
        System.out.println(5+5);

        String name = "Yash";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        System.out.println("\nHello " + name);

        String firstName = "\nYash ";
        String lastName = "Dhadve";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Real Life Example
        // Student data
        String studentName = "Yash Dhadve";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';
        // Print variables
        System.out.println("\nStudent name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("\nLength is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}