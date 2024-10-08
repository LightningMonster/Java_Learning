/*
 * Define a Item class (item_number, item_name, item_price). Define a default and parameterized 
 constructor. Keep a count of objects created. Create objects using parameterized constructor 
 and display the object count after each object is created.(Use static member and method). Also 
 display the contents of each object.
 */
package Sem_5_slips;

class Item {
    // Instance variables
    private int itemNumber;
    private String itemName;
    private double itemPrice;

    // Static member to count the number of objects created
    private static int objectCount = 0;

    // Default constructor
    public Item() {
        this.itemNumber = 0;
        this.itemName = "Unknown";
        this.itemPrice = 0.0;
        objectCount++; // Increment the count
    }

    // Parameterized constructor
    public Item(int itemNumber, String itemName, double itemPrice) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        objectCount++; // Increment the count
    }

    // Static method to get the count of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
    }
}

public class slip_26_1 {
    public static void main(String[] args) {
        // Create objects using parameterized constructor
        Item item1 = new Item(101, "Laptop", 800.00);
        item1.displayItemDetails();
        System.out.println("Total Items Created: " + Item.getObjectCount());

        System.out.println();

        Item item2 = new Item(102, "Smartphone", 500.00);
        item2.displayItemDetails();
        System.out.println("Total Items Created: " + Item.getObjectCount());

        System.out.println();

        Item item3 = new Item(103, "Tablet", 300.00);
        item3.displayItemDetails();
        System.out.println("Total Items Created: " + Item.getObjectCount());
    }
}

