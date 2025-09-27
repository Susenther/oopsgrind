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

    public class demo{
        public static void main(String []args){
            mobile obj1 = new mobile();
            obj1.brand = "Apple";
            obj1.price = 1500;
            mobile.name = "Smartphone";
        }
    }
     
}