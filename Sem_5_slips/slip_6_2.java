/*
 * Create an abstract class “order” having members id, description. Create two subclasses 
 “PurchaseOrder” and “Sales Order” having members customer name and Vendor name 
 respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase 
 Order and Sales Order and accept and display details.

 */

import java.util.Scanner;

// Abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    // Abstract methods for accepting and displaying details
    abstract void accept();
    abstract void display();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    private String customerName;

    // Method to accept details of Purchase Order
    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter description: ");
        description = sc.nextLine();
        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();
    }

    // Method to display details of Purchase Order
    @Override
    void display() {
        System.out.println("\nPurchase Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

// Subclass SalesOrder
class SalesOrder extends Order {
    private String vendorName;

    // Method to accept details of Sales Order
    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter description: ");
        description = sc.nextLine();
        System.out.print("Enter vendor name: ");
        vendorName = sc.nextLine();
    }

    // Method to display details of Sales Order
    @Override
    void display() {
        System.out.println("\nSales Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

// Main class
public class slip_6_2   {
    public static void main(String[] args) {
        // Arrays to store 3 objects of PurchaseOrder and SalesOrder
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        SalesOrder[] salesOrders = new SalesOrder[3];

        // Accepting details for 3 Purchase Orders
        System.out.println("Enter details for 3 Purchase Orders:");
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].accept();
        }

        // Accepting details for 3 Sales Orders
        System.out.println("\nEnter details for 3 Sales Orders:");
        for (int i = 0; i < 3; i++) {
            salesOrders[i] = new SalesOrder();
            salesOrders[i].accept();
        }

        // Displaying details of 3 Purchase Orders
        System.out.println("\nDisplaying Purchase Orders:");
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i].display();
        }

        // Displaying details of 3 Sales Orders
        System.out.println("\nDisplaying Sales Orders:");
        for (int i = 0; i < 3; i++) {
            salesOrders[i].display();
        }
    }
}

/*
 * Enter details for 3 Purchase Orders:
Enter Purchase Order ID: 101
Enter description: Purchase of electronics
Enter customer name: John Doe
Enter Purchase Order ID: 102
Enter description: Purchase of furniture
Enter customer name: Alice Smith
Enter Purchase Order ID: 103
Enter description: Purchase of books
Enter customer name: Bob Johnson

Enter details for 3 Sales Orders:
Enter Sales Order ID: 201
Enter description: Sale of laptops
Enter vendor name: XYZ Electronics
Enter Sales Order ID: 202
Enter description: Sale of chairs
Enter vendor name: ABC Furniture
Enter Sales Order ID: 203
Enter description: Sale of novels
Enter vendor name: DEF Books

Displaying Purchase Orders:

Purchase Order Details:
ID: 101
Description: Purchase of electronics
Customer Name: John Doe

Purchase Order Details:
ID: 102
Description: Purchase of furniture
Customer Name: Alice Smith

Purchase Order Details:
ID: 103
Description: Purchase of books
Customer Name: Bob Johnson

Displaying Sales Orders:

Sales Order Details:
ID: 201
Description: Sale of laptops
Vendor Name: XYZ Electronics

Sales Order Details:
ID: 202
Description: Sale of chairs
Vendor Name: ABC Furniture

Sales Order Details:
ID: 203
Description: Sale of novels
Vendor Name: DEF Books

 */

