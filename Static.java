class Static_keyword{
    public static void main(String[] args) {
        Static.subject = "Computer Science";
        Static.Display();
    }
}

public class Static {
    //static field
    static String subject;

    static void Display()
    {
        System.out.println("Subject: "+subject);
    }
}

