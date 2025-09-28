package necessary;
import java.util.*;
class Car1{
    String Brand;
    int speed;

    void accelerate(int throttle){
            speed += throttle;
    }

    void Brake(int engineBrake){
           speed -= engineBrake;
           if(speed<0)speed = 0;
    }
    void display(){
         System.out.println("Brand : "+ Brand +"\nspeed : "+ speed);
    }
}


public class task2 {
    public static void main(String []args){
        Car1 c1 = new Car1();
        c1.Brand = "Ferrari";
        c1.speed = 250;

        Car1 c2 = new Car1();
        c2.Brand = "Ford";
        c2.speed = 200;

        c1.accelerate(50);
        c1.Brake(20);
        c1.display();
        c2.accelerate(100);
        c2.Brake(40);
        c2.display();
    }
    
}
