package sta;
import java.util.*;
class Car{
    String Brand;
    int speed;
    static int totalCars;

    Car(String  Brand,int speed){
          this.Brand = Brand;
          this.speed = speed;
          totalCars++;
    }
    void display(){
        System.out.println("Brand: " + Brand + "\nSpeed: " + speed);
    }
    static void showTotalCars(){
        System.out.println("Total cars created: " + totalCars);
    }
}

public class task3{
    public static void main(String []args){
        Car c1 = new Car("Bmw",200);
        Car c2 = new Car("Ferrari", 280);
        Car c3 = new Car("Porsche", 300);
        Car c4 = new Car("Koinesegg",400);

        c1.display();
        c2.display();
        c3.display();
        c4.display();

        Car.showTotalCars();
    }
}
