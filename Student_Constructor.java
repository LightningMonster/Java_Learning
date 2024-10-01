public class Student_Constructor {
    String name;
    int id;

    //constructor
    Student_Constructor(){
        System.out.println("Initializing Values...");
        name = "NA";
        id = -1;
    }

    public static void main(String[] args) {
        Student_Constructor s1 = new Student_Constructor();

        System.out.println("Name: "+s1.name);
        System.out.println("ID: "+ s1.id);
    }
}
