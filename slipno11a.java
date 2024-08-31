import java.io.*;
import java.util.Scanner;

interface Operation {
    float pi = 3.142f;
    void area();
    void volume();
}

class Cylinder implements Operation {
    double radius, height;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    @Override
    public void area() {
        double area = (2 * Operation.pi * radius * height) + (2 * Operation.pi * radius * radius);
        System.out.println("The area of the cylinder is: " + area);
    }

    @Override
    public void volume() {
        double volume = Operation.pi * radius * radius * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

public class slipno11a {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        try {
            cylinder.input();
            cylinder.area();
            cylinder.volume();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
