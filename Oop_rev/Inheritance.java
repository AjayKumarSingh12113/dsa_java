package Oop_rev;

public class Inheritance {
    static class Animal{
        String color = "blue";
        int key =12;

        public void eat(){
            System.out.println("animal eating");
        }

        public Animal(){
            System.out.println("const 1");
        }
        public Animal(int s){
            System.out.println("const s");
        }
    }
    
    static class Dog extends Animal{

        
        int key = 2;
        
        public void speak(){
            System.out.println(this.key);
            System.out.println(super.key);
            System.out.println(key);
        }
        public Dog(){
            super(2);
            System.out.println("second constructor");
        }


    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.speak();
    }
}
