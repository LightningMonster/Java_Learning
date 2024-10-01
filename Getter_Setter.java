public class Getter_Setter {
    //privete variable
    private String name;

    //getter mathod
    public String getName() {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;  
    }

    public static void main(String[] args) {
        Getter_Setter t1 = new Getter_Setter();

        t1.setName("Yash");
        System.out.println(t1.getName());

    }

}
