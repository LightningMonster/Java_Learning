abstract class Polygon{
    //abstract method
    abstract void getArea();

    //regular method
    void printSides(int side){
        System.out.println("Number of sides: "+side);
    }
}

class Rectangle extends Polygon{

    //implement abstract method
    void getArea()
    {
        System.out.println("Area of Rectangle");
    }
}

public class Polygon_Abstract {
    public static void main(String[] args) {
        
        //Create object of Rectangle
        Rectangle obj = new Rectangle();

        //call regular method
        obj.printSides(4);

        //call abstract method
        obj.getArea();
    }
    
}
