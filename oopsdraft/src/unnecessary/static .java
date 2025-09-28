package unnecessary;
import java.util.*;

class mobile{

    String brand;
    int price;
    static  String name;

    static{
        name = "phone";
        System.out.println("in static block");
    }

    public mobile(){
        brand  = "";
        price = 200;
        System.out.println("in constructor");
        
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : "+ name);
    }
    public static void show1(mobile obj)
    {
        System.out.println("in static method");
    }

    public class demo{
        public static void main(String []args)
        {
            mobile obj1 = new mobile();
            obj1.brand = "Apple";
            obj1.price = 1500;
            mobile.name = "Smartphone";
 
        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 2000;
        mobile.name = "Smartphone";

        obj1.show();
        obj2.show();

        mobile.show1(obj1);

    }
  }
     
}