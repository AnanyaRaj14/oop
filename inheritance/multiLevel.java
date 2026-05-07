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

class Puppy extends Dog{
    void weeps(){
        System.out.println("puppy weeps");
    }
}



public class multiLevel{
    public static void main(String[] args){
        Puppy p1 = new Puppy();
        p1.color = "black";
        p1.legs = 4;
        System.out.println(p1.color);
        System.out.println(p1.legs);
        p1.eats();
        p1.breathes();
        p1.barks();
        p1.sleeps();
        p1.weeps();
    }
}