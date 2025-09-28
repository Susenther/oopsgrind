package unnecessary;
import java.util.*;

 class Car{
      String brand;
      int speed;

      void accelerate(int delta){
        speed += delta;
      }

      void display(){
        System.out.print("Brand: " + brand + ",speed:" + speed);
      }
}

public class ob{
    public static void main(String []args){
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.speed = 100;
        c1.accelerate(20);
        c1.display();
    }
}
