package OOPS;

/**
 * Polymorphism
 */
public class Polymorphism {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 4.4f));
        System.out.println(calc.sum(1, 3, 4));

        Deer d = new Deer();
        d.eat();
    }
}


//This is example of Method Overloading
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//This is example of Method Overriding
class Animal{
    void eat(){
        System.out.println("They eat anything");
    }
}

class Deer{
    void eat(){
        System.out.println("They eat Grass");
    }
}