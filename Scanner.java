import java.util.Scanner;
import myPack.MyPackageClass;  // Import the user-defined package

class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = s.nextLine();
        System.out.println("Hi " + userName);

        // Calling the method from MyPackageClass
        MyPackageClass.printMessage();  

        s.close();
    }    
}
