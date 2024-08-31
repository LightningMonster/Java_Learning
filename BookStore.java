import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    Book(int bookId, String bookName, double bookPrice, int bookQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
    }
}

public class BookStore {
    private static final String FILE_NAME = "book.dat";
    private static final int RECORD_SIZE = 60; // Adjust based on your field sizes

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n1. Add Book");
                System.out.println("2. Search Book by Name");
                System.out.println("3. Display All Books and Total Cost");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        addBook(scanner);
                        break;
                    case 2:
                        System.out.print("Enter the book name to search: ");
                        String searchName = scanner.nextLine();
                        searchBookByName(searchName);
                        break;
                    case 3:
                        displayAllBooksAndTotalCost();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to add a book
    private static void addBook(Scanner scanner) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw")) {
            file.seek(file.length()); // Move to the end of the file

            System.out.print("Enter Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Book Name: ");
            String bookName = scanner.nextLine();

            System.out.print("Enter Book Price: ");
            double bookPrice = scanner.nextDouble();

            System.out.print("Enter Book Quantity: ");
            int bookQty = scanner.nextInt();

            // Write book details to the file
            file.writeInt(bookId);
            writeString(file, bookName, 30); // Writing a fixed-size string (30 characters)
            file.writeDouble(bookPrice);
            file.writeInt(bookQty);
            System.out.println("Book added successfully!");
        }
    }

    // Method to search for a book by name
    private static void searchBookByName(String searchName) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            boolean found = false;
            while (file.getFilePointer() < file.length()) {
                int bookId = file.readInt();
                String bookName = readString(file, 30);
                double bookPrice = file.readDouble();
                int bookQty = file.readInt();

                if (bookName.trim().equalsIgnoreCase(searchName)) {
                    System.out.println("Book found:");
                    System.out.printf("Book ID: %d, Book Name: %s, Price: %.2f, Quantity: %d\n",
                            bookId, bookName.trim(), bookPrice, bookQty);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found!");
            }
        }
    }

    // Method to display all books and calculate total cost
    private static void displayAllBooksAndTotalCost() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            double totalCost = 0;
            System.out.println("Book Details:");
            System.out.printf("%-10s %-30s %-10s %-10s\n", "Book ID", "Book Name", "Price", "Quantity");

            while (file.getFilePointer() < file.length()) {
                int bookId = file.readInt();
                String bookName = readString(file, 30);
                double bookPrice = file.readDouble();
                int bookQty = file.readInt();
                totalCost += bookPrice * bookQty;

                System.out.printf("%-10d %-30s %-10.2f %-10d\n", bookId, bookName.trim(), bookPrice, bookQty);
            }

            System.out.printf("Total cost of all books: %.2f\n", totalCost);
        }
    }

    // Helper method to write a fixed-size string
    private static void writeString(RandomAccessFile file, String str, int length) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        sb.setLength(length); // Ensure the string is of fixed length
        file.writeChars(sb.toString());
    }

    // Helper method to read a fixed-size string
    private static String readString(RandomAccessFile file, int length) throws IOException {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = file.readChar();
        }
        return new String(chars).trim();
    }
}
