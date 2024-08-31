import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = s.nextInt();
        System.out.println("\n1.Even or Odd.\n2.Negative or Positive.\nEnter your choice: ");
        int choice = s.nextInt();

        switch(choice)
        {
            case 1: even_odd(num);
                    break;

            case 2: P_S(num);
                    break;
        }
        s.close();
    }

    public static void even_odd(int num)
    {
        if(num%2==0)
            System.out.println("Number "+num+" is even!");
        else
        System.out.println("Number "+num+" is odd!");
    }

    public static void P_S(int num)
    {
        if(num==0)
            System.out.println("It's 0!");
        else if(num<0)
            System.out.println("Number "+num+" is Negative!");
        else if(num>0)
            System.out.println("Number "+num+" is Positive!");
    }
    
}

