class Animal{
    String color = "Black";
}

class Dog extends Animal{
    String color = "white";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}


public class superClass{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.printColor();
    }
}