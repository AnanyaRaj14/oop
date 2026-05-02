import java.util.*;

class Student{
    String name;
    int rollno;
    String add;

    Student(String name, int rollno, String add){
        this.name = name;
        this.rollno = rollno;
        this.add = add;
    }

    // method
    void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("rollno :" + rollno);
        System.out.println("Address :" + add);
    }
}

public class classObjconstMethod{
    public static void main(String[] args){
        Student s1 = new Student("Ananya", 19, "Bihar");
        s1.displayDetails();
    }

}