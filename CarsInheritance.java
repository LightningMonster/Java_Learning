/* Create a class Vehicle with properties speed and color. 
Create a subclass Car that adds a property model. 
Write a constructor in both classes to initialize 
their respective properties and display the details of 
the Car object using a method. */

class Vehicle{
    int speed;
    String color;

    public void properties(){
        System.out.println("Color of the car is: "+color);
        System.out.println("Speed of the car is: "+speed+"km/hr.");
    }
}
class Car extends Vehicle{
    String model;
    public void Model(){
        
        System.out.println("Model of the car is: "+model);
        super.properties();
    }

}

public class CarsInheritance {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.model = "F1";
        car1.color = "Red & White";
        car1.speed = 400;

        car1.Model();
        car1.properties(); 
    }
}
