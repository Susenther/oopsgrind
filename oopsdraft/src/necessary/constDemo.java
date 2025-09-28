package necessary;
import java.util.*;
 class Car {
    String brand ;
    int speed;

    Car(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void display(){
        System.out.println("Brand "+brand + ",speed"+speed);
    }
 }


      public class constDemo{
      public static void main(String []args){
              Car c1 = new Car("Toyota",100);
              Car c2 = new Car("benz",100);


              c1.display();
              c2.display();
      }
    }

