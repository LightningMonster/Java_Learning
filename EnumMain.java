enum Level{
    LOW, MEDIUM, HIGH
}

public class EnumMain {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        
        switch(myVar){
            case LOW: System.out.println("The value is LOW");
                        break;
            
            case MEDIUM: System.out.println("The value is MEDIUM");
                        break;

            case HIGH: System.out.println("The value is HIGH");
                        break;
        }

        for(Level myvar : Level.values()){
            System.out.println(myvar);
        }
    }
}
