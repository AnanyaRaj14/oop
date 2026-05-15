class Animal{
    void eats(){
        System.out.println("Animal eats");
    }
}

class Lion extends Animal{
    @Override
    void eats(){
        System.out.println("Lion eats meat");
    }
}

class overridingEg{
    public static void main(String[] args){
        Lion l1 = new Lion();
        l1.eats();
    }
}