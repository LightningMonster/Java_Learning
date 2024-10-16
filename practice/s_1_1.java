package practice;

public class s_1_1{
    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            System.out.println("Please enter a number!");
            return;
        }

        System.out.println("Prime numbers in the provides array: ");
        for(String arg : args)
        {
            int num = Integer.parseInt(arg);
            try
            {
                if(isPrime(num))
                {
                    System.out.println(arg);
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println(arg+" Is not valid Integer");
            }
        }
    }

    private static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}