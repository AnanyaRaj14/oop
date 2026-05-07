class Address{
    String city;
    Address(String city){
        this.city = city;
    }
}

class Student{
    String name;
    Address address;

    // shallow copy constructor
    Student(String name, Address address){
        this.name = name;
        this.address = address;
    }
    
    // deep copy constructor
    Student(Student other){
        this.name = other.name;
        this.address = new Address(other.address.city);
    }
}





public class shallowDeep{
    public static void main(String[] args){
        Address a1 = new Address("Patna");
        Student s1 = new Student("Ananya", a1);
        Student s2 = new Student(s1);   // deep copy

        System.out.println("Before modification : ");
        System.out.println(s1.name + " - " + s1.address.city);
        System.out.println(s2.name + " - " + s2.address.city);

        s1.address.city = "Delhi";

        System.out.println("After modification : ");
        System.out.println(s1.name + " - " + s1.address.city);
        System.out.println(s2.name + " - " + s2.address.city);
    }

}