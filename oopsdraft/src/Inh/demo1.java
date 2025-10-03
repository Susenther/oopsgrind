package Inh;
import java.util.*;
class vehicle{
    String brand;
    int speed;

    vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void start(){
        System.out.println(brand + " is Starting...")
    }
}

class car extends vehicle{
    int door;

    car(String brand,int speed,int door){
        super(brand,speed);
        this.door = door;
    }


void honk(){
    System.out.println(brand +" is honking..");
    }  
}

public class demo1 {
    public static void main(String []args){
        car c1 = new car("BMW",180,4);
        c1.start();
        c1.honk();
       
    }
}
