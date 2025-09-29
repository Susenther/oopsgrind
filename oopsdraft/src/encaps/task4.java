package encaps;
import java.util.*;
class Car{
    private String Brand;
    private int speed;

    public Car(String Brand,int speed){
        this.Brand = Brand;
        setSpeed(speed);
    }
    public String getbrand(){
        return Brand;
    }
    public void setBrand(String Brand){
        if(Brand == null||Brand.isEmpty()){
            System.out.println("Brand name cannot be empty");
        }else{
            this.Brand = Brand;
        }
    }
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("Speed cannot be negative.Setting to 0");
            this.speed = 0;
        }else{
            this.speed = speed;
        }
    }
    public void accelerate(int throttle){
           setSpeed(speed + throttle );
    }
    public void brake(int engineBreak){
           setSpeed(speed - engineBreak);
    }
    public void display(){
         System.out.println("Brand: " + Brand + "\nSpeed "+ speed );
    }
}

public class task4 {
    public static void main(String []args){
        Car c1 = new Car("Ferrari",280);
        Car c2 = new Car("Ford",-180);

        c1.accelerate(100);
        c1.brake(50);
        c1.display();

        c2.setBrand("");
        c2.display();




    }
    
}
