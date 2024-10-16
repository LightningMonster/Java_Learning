import java.util.ArrayList;
import java.util.Collections;
public class Array {
    public static void main(String[] args) {
        // Create an array of integers
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Lamborghini");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add("Audi");

        //Inserting by index
        cars.add(1, "Nissan");

        //access an item
        System.out.println(cars.get(0));

        //changing an item
        cars.set(4, "Lexus");

        System.out.println(cars);

        //removing an item
        cars.remove(3);
        System.out.println(cars);

        //Array size
        System.out.println("Array size: "+cars.size());

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //Sorting array
        Collections.sort(cars);
        System.out.println(cars);
    }
}
