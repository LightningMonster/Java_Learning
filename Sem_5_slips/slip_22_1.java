/*
 * Write a program to create an abstract class named Shape that contains two integers and an 
 empty method named printArea(). Provide three classes named Rectangle, Triangle and Circle 
 such that each one of the classes extends the class Shape. Each one of the classes contain only
 the method printArea() that prints the area of the given shape. (use method overriding).
 */
package Sem_5_slips;

// Abstract class Shape
abstract class Shape {
    int dimension1; // Can be used for width, base, or radius
    int dimension2; // Can be used for height

    // Abstract method
    abstract void printArea();
}

// Class Rectangle extending Shape
class Rectangle extends Shape {
    // Constructor to initialize dimensions
    public Rectangle(int width, int height) {
        this.dimension1 = width;
        this.dimension2 = height;
    }

    // Overriding the printArea method to calculate and print area of rectangle
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Class Triangle extending Shape
class Triangle extends Shape {
    // Constructor to initialize dimensions
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    // Overriding the printArea method to calculate and print area of triangle
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Class Circle extending Shape
class Circle extends Shape {
    // Constructor to initialize radius
    public Circle(int radius) {
        this.dimension1 = radius; // Using dimension1 to store radius
    }

    // Overriding the printArea method to calculate and print area of circle
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the shapes
public class slip_22_1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.printArea();

        Shape triangle = new Triangle(5, 10);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}

