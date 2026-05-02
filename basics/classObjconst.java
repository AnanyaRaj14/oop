import java.util.*;
class Student{
    String name;
    int rollno;
    String add;

    Student(String name, int rollno, String add){
        this.name  = name;
        this.rollno = rollno;
        this.add = add;
    }
}
public class classObjconst{
    public static void main(String[] args){
        Student s1 = new Student("Ananya", 21, "Bihar");
        System.out.println(s1.name);
    }
}
