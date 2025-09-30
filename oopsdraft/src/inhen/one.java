package inhen;
import java.util.*;
class Animal{
    void eat(){
        System.out.println("Animal is eaing");
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Dog is Barking");
        }
    }

public class one{
    public static void main(String []args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}







public class one {
    
}
