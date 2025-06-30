package Oop_rev;

public class Override {
    static class Animal {
    
        //overridden method :- jis method ko override kya gya hia 
        public void eat(){
            System.out.println("eating one ");
        }
    }
    static class Dog extends Animal{
        
        // overriding method : - animal ke eat ko override kr diya 
        public void eat(){
            System.out.println("eating all type of food");
        }
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
