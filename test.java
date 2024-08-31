public class test {
    public static void main(String[] args) {
        B b = new B();
        b.add();
        b.subtract();
    }

    static class A {
        void add() {
            int a = 2, b = 1;
            System.out.println("Addition: " + (a + b));
            
            String c = (a > b)? "a is greaterthan b" : "a is lessthan b"; 
            System.out.println(c);
        }
    }

    static class B extends A {
        void subtract() {
            int a = 2, b = 1;
            System.out.println("Subtraction: " + (a - b));
        }
    }
}