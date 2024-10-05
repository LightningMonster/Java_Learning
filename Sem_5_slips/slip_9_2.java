/*
 * Write a program to using marker interface create a class Product (product_id, product_name,
 product_cost, product_quantity) default and parameterized constructor. Create objectsof class 
 product and display the contents of each object and Also display the object count.

 */
package Sem_5_slips;

// Marker interface
interface ProductMarker {
    // No methods (marker interface)
}

// Product class implementing the marker interface
class Product implements ProductMarker {
    private int product_id;
    private String product_name;
    private double product_cost;
    private int product_quantity;

    // Static variable to track object count
    private static int objectCount = 0;

    // Default constructor
    public Product() {
        this.product_id = 0;
        this.product_name = "Unknown";
        this.product_cost = 0.0;
        this.product_quantity = 0;
        objectCount++;  // Increment object count
    }

    // Parameterized constructor
    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++;  // Increment object count
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: " + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println();
    }

    // Static method to display object count
    public static void displayObjectCount() {
        System.out.println("Total number of Product objects created: " + objectCount);
    }
}

// Main class
public class slip_9_2 {
    public static void main(String[] args) {
        // Create default product object
        Product defaultProduct = new Product();
        System.out.println("Default Product Details:");
        defaultProduct.displayProductDetails();

        // Create parameterized product objects
        Product product1 = new Product(101, "Laptop", 50000.0, 10);
        Product product2 = new Product(102, "Smartphone", 15000.0, 25);
        Product product3 = new Product(103, "Headphones", 3000.0, 50);

        // Display details of each product
        System.out.println("Parameterized Product Details:");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Display the total number of Product objects created
        Product.displayObjectCount();
    }
}

