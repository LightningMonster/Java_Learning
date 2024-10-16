public class Student_ParameterizedConstructor {
    String name;
    int id;

    //constructor with parameters
    Student_ParameterizedConstructor(String student_name, int student_id)
    {
        this.name = student_name;
        this.id = student_id;
    }

    public static void main(String[] args) {
        //pass value to contructor
        Student_ParameterizedConstructor s1 = new Student_ParameterizedConstructor("Yash", 101);
        Student_ParameterizedConstructor s2 = new Student_ParameterizedConstructor("Phalguni", 102);

        //Printing information
        System.out.println("Student 1: "+s1.name+" ID: "+s1.id);
        System.out.println("Student 2: "+s2.name+" ID: "+s2.id);
    }
}
