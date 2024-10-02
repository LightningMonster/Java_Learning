class OuterClass{
    int x = 10;
    static class InnerClass{
        int y = 5;
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        OuterClass outer = new OuterClass();
        System.out.println("Sum of Outer class's var & Inner class's var: "+(outer.x+inner.y));
    } 
}


