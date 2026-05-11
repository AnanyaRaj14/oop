class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, double b){
        return a+b;
    }
}


class overloadingEg{
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(10, 20));
        System.out.println(c1.sum(10, 20, 30));
        System.out.println(c1.sum(5.5, 3.9));
    }
}