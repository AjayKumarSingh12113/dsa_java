package Oops;
public class SingleInheritance {
    public static void main(String[] args) {
        Fish dolphine = new Fish();
        dolphine.eat();
        //dolphine.breath();


        Dogs tommy = new Dogs();
        tommy.eat();
        tommy.colour = "red";
        tommy.legs = 2;
        tommy.bread = "normal";
        System.out.println(tommy.colour+tommy.legs);
    }
}

class Animal {
    String colour;

    void breath() {
        System.out.println("breathing");
    }

    void eat() {
        System.out.println("eating");
    }
}
// single level inheritance
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swimming");
    }
}
// for multi level inheritance

class Mammal extends Animal {
    int legs;
}

class Dogs extends Mammal {
    String bread;
}
