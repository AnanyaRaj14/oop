class Student{
    int id;
    String name;

    // Default constructor
    Student(){
        System.out.println("Default constructor is called...");
    }

    // parameterized constructor
    Student(int id, String name){
        this.id = id;
        this.name = name;

        System.out.println("id is : " + id);
        System.out.println("name is : " + name);
        System.out.println("Parameterized constructor is called");
    }

    Student(int id, String name, int age){
        System.out.println("id is : " + id);
        System.out.println("name is : " + name);
        System.out.println("age is : " + age + " years ");
        System.out.println("Parameterized constructor with different argument is called");
    }
}


public class constru{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(5, "Ananya");
        Student s3 = new Student(5, "Adhya", 5);

    }
}