import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        // Adding elements to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("Initial LinkedList: " + cars);

        // Adding element at the first position
        cars.addFirst("Lamborghini");
        System.out.println("After adding Lamborghini at the first position: " + cars);

        // Adding element at the last position
        cars.addLast("Nissan");
        System.out.println("After adding Nissan at the last position: " + cars);

        // Removing the first item
        cars.removeFirst();
        System.out.println("After removing the first element: " + cars);

        // Removing the last item
        cars.removeLast();
        System.out.println("After removing the last element: " + cars);

        // Getting the first item
        System.out.println("First element: " + cars.getFirst());

        // Getting the last item
        System.out.println("Last element: " + cars.getLast());
    }
}
