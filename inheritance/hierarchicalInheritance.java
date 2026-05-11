class Animal{
    String color = "Black";

    void eats(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("cat meows");
    }
}




class hierarchicalInheritance{
    public static void main(String[] args){
        Dog d1 = new Dog();
        System.out.println(d1.color);
        d1.bark();

        System.out.println("\n");

        Cat c1 = new Cat();
        System.out.println(c1.color);
        c1.meow();
    }
}