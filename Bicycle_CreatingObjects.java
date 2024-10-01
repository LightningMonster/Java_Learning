public class Bicycle_CreatingObjects{
    
    int gear = 5;

    void applyBrake()
    {
        System.out.println("Bicycle is applying brakes...");
    }

    public static void main(String[] args)
    {
        //creating objects
        Bicycle_CreatingObjects bike1 = new Bicycle_CreatingObjects();
        Bicycle_CreatingObjects bike2 = new Bicycle_CreatingObjects();

        bike2.gear=7;

        System.out.println("Number of bike 1 gears:"+bike1.gear);
        System.out.println("Number of bike 2 gears:"+bike2.gear);
        bike1.applyBrake();
    }
    
}
