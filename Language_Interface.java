//Creating an interface
interface Language{
    void getName(String name);
}

interface Language1{
    void print_hello();
}

//implementing the interface in a class
class ProgrammingLanguage implements Language, Language1{
    //abstract method implementation 
    public void getName(String name){
        System.out.println("The name of the programming language is: "+name);
    }
    public void print_hello()
    {
        System.out.println("Hello, I am a programming language!");
    }
}

public class Language_Interface {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
        language.print_hello();    
    }
}
