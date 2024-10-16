class Animal {
    String name;
    public void eat()
    {
        System.out.println("I am a Animal.");
        System.out.println("I can eat!");
    }
}

class Dog extends Animal
{
    public void display(){
        System.out.println("My name is: "+ name);
    }
}

class AnimalMain
{
    public static void main(String args[])
    {
        Dog dog1 = new Dog();

        dog1.name = "Tommy";
        dog1.eat();
        dog1.display();
    }
}