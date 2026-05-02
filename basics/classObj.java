import java.util.*;

class Student{
    String name;
    int rollno;
    String add;
}

public class classObj{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ananya";
        s1.rollno = 18;
        s1.add = "Darbhanga";

        System.out.println(s1.name);
    }
}