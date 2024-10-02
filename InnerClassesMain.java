class OuterClass{
    int x = 10;
    class InnerClass{
        int y = 5;
    }
}

public class InnerClassesMain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        System.out.println("Sum of Outer class's var & Inner class's var: "+(outer.x+inner.y));
    }    
}
