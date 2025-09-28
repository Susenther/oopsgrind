package unnecessary;
import java.util.*;
class Car1{
    private String brand;
    private int speed;

    public Car1(){
        this.brand = "unknown";
        this.speed = 0;
    }

    public Car1(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Brand: "+brand + ",speed: " + speed);
    }
}

public class Con{
    public static void main(String []args){
        Car1 c1 = new Car1();
        Car1 c2 = new Car1("Honda",80);
        c1.display();
        c2.display();
    }
}
