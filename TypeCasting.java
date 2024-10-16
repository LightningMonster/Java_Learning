
public class TypeCasting {
    public static void main(String[] args)
    {
        TypeCasting t = new TypeCasting();

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
