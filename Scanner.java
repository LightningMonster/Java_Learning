import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = s.nextLine();
        System.out.println("Hii "+userName);
        s.close();
    }    
}
