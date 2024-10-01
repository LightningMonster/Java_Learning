//Creating an interface
interface Language{
    void getName(String name);
}

//implementing the interface in a class
class ProgrammingLanguage implements Language{
    //abstract method implementation 
    public void getName(String name){
        System.out.println("The name of the programming language is: "+name);
    }
}

public class Language_Interface {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");    
    }
}
