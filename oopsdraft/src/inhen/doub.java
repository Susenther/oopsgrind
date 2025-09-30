package inhen;
import java.util.*;
class LivingBeing{
    void breathe(){
        System.out.println("Living being is breathing");
    }
} 
class Animal extends LivingBeing{
    void eat(){
        System.out.println("Animal is eating...");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}

public class doub {
    public static void main(String []args){
        Dog d = new Dog();
        d.breathe();
        d.eat();
        d.bark();
    }
    
}
