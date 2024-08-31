@FunctionalInterface

interface Cubenum{
    public void print(int num1);
}

public class Exfuncinterface implements Cubenum{
    public void print(int num1){
        System.out.println(num1*num1*num1);
    }
    public static void main(String [] a){
        Exfuncinterface e=new Exfuncinterface();
        e.print(5);
    }
}