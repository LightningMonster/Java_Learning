//Day3
public class Day3 {
    public static void main(String[] args) {
        //Assignment Operators
        // 1. Simple assignment
        int a = 10;
        System.out.println("Initial value of a: " + a);

        // 2. Add and assign
        a += 5;
        System.out.println("After a += 5: " + a);

        // 3. Subtract and assign
        a -= 3;
        System.out.println("After a -= 3: " + a);

        // 4. Multiply and assign
        a *= 2; 
        System.out.println("After a *= 2: " + a);

        // 5. Divide and assign
        a /= 4; 
        System.out.println("After a /= 4: " + a);

        // 6. Modulus and assign
        a %= 3; 
        System.out.println("After a %= 3: " + a);

        // 7. Bitwise AND and assign
        a &= 1; 
        System.out.println("After a &= 1: " + a);

        // 8. Bitwise OR and assign
        a |= 2; 
        System.out.println("After a |= 2: " + a);

        // 9. Bitwise XOR and assign
        a ^= 3; 
        System.out.println("After a ^= 3: " + a);

        // 10. Left shift and assign
        a <<= 1; 
        System.out.println("After a <<= 1: " + a);

        // 11. Right shift and assign
        a >>= 1; 
        System.out.println("After a >>= 1: " + a);

        // 12. Unsigned right shift and assign
        a >>>= 1; 
        System.out.println("After a >>>= 1: " + a);


        //Comparison Operators
        int x = 10;
        int y = 20;

        //Equal to
        boolean result = (x == y);
        System.out.println("x == y: "+ result);

        //Not equal to
        result = (x != y);
        System.out.println("x != y: "+ result);

        //Greater than
        result = (x > y);
        System.out.println("x > y: "+ result);

        //Less than
        result = (x < y);
        System.out.println("x < y: "+ result);

        //Greater than or equal to
        result = (x >= y);
        System.out.println("x >= y: "+ result);

        //Less than or equal to
        result = (x <= y);
        System.out.println("x <= y: "+ result);

        x = 30;
        y = 30;

        System.out.println("\nNew values: x = 30, y = 30");

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }
}
