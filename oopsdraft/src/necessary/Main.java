package necessary;
import java.util.*;
class Car{
    private String brand;
    private static int count = 0;

    public Car(String string) {
        //TODO Auto-generated constructor stub
    }

    public Car(String brand){
        this.brand = brand;
        count++;
    }

    public static void showCount(){
        System.out.println("Cars created: " + count);
    }
}
public class Main{
    public static void main(String []args){
        new Car("Toyota");
        new Car("Honda");
        Car.showCount();
        }
}
