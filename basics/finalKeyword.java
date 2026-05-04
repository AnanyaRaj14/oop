import java.util.*;

class Student{
    final String name;
    int rollno;
    String add;

    Student(String name, int rollno, String add){
        this.name = name;
        this.rollno = rollno;
        this.add = add;
    }

}

public class finalKeyword{
    public static void main(String[] args){
        Student s1 = new Student("Ananya", 18, "Kolkata");
        s1.name = "Adhya";
        System.out.println(s1.name);
    }
}