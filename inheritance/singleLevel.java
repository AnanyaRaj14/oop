class Animal{
    String color;

    void eats(){
        System.out.println("Animal eats");
    }

    void breathes(){
        System.out.println("Animal breathes");
    }
}

class Dog extends Animal{
    int legs;

    void barks(){
        System.out.println("Dog barks");
    }

    void sleeps(){
        System.out.println("Dog sleeps");
    }
}



public class basic{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.color = "black";
        d1.legs = 4;
        System.out.println(d1.color);
        System.out.println(d1.legs);
        d1.eats();
        d1.breathes();
        d1.barks();
        d1.sleeps();
    }
}