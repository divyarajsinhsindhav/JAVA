package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.setColor(); //Without setColor() h.color gives 'null'
        System.out.println(h.color);

        Mustang horse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = null;
        System.out.println("Animal Constructor is Called.");
    }

    void eat(){
        System.out.println("Animal Eats what they like");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is Called.");
    }

    void setColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is Called.");
    }
}
