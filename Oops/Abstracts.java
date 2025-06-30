package Oops;
public class Abstracts {
    public static void main(String[] args) {
        // Animal a = new Animal();// prop -1 ham abstract class ki object nhi bana skte hai dekho causing error
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeC();
        System.out.println(h.color);

        Chichen ch = new Chichen();
        ch.eat();
        ch.walk();
        

    }
}

abstract class Animal {
    String color;
    Animal() {// abstract ke constructor ho skte hai 
        color = "brown"; // sare child class ko yeh color milege bad tak oh change na kr leee  
    }
    void eat() {
        System.out.println("something eating");
    }

    abstract void walk();// yeh srf idea dega yeh child class pe depend nhi karega
}

class Horse extends Animal {
    void changeC() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walking on 4 legs");
    }
}
class Chichen extends Animal {
    void walk() {
        System.out.println("walking on 2 legs");
    }
}

