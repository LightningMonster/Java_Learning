
public class test {
    public static void main(String[] args)
    {
        test t = new test();

        t.TypeCastingManually();
    }

    public void TypeCastingManually()
    {
        int num = 10;
        System.out.println("Variable num is integer type "+num);

        double num1 = (double) num;
        System.out.println("Variable num is double type "+num1);
    }
}


