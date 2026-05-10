interface Animal{
    void eats();
}

interface Pet{
    void plays();
}

class Dog implements Animal, Pet{

    public void eats(){
        System.out.println("dogs eats");
    }

    public void plays(){
        System.out.println("dogs plays");
    }

    void barks(){
        System.out.println("Dog barks");
    }
}


public class interfaceEg{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.eats();
        d1.plays();
        d1.barks();
    }
}

