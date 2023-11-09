package OOPS;

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        Fish Shark = new Fish();
        // System.out.println(Shark.color);
        // Shark.eat();

        Dog tobby= new Dog();
        tobby.eat();
        tobby.legs = 4;
        System.out.println(tobby.legs);
    }
}

//Base Class
//Parant
class Animal{
    String color;
    
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breath");
    }
}

//Derived Class
//Child
//This is Example of Single Level Inheritance
class Fish extends Animal{
    int fins;
    Fish(){
        super.color = "Orange"; //This is Example of Super Keyword
    }
    void swims(){
        System.out.println("Swim in the Water");
    }
}

class Mammal extends Animal{
    int legs;
}

//This is Example of Multilevel Inheritance
class Dog extends Mammal{
    String breed;
}