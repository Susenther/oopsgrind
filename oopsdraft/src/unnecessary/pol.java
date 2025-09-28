package unnecessary;
import java.util.*;
class car {
     private int speed;

     public void setSpeed(int s){
        if(s>=0)speed = s;
     }
     public int getSpeed(){
        return speed;
     }
}

public class pol{
   public static void main(String []args){
      car myCar = new car();
      myCar.setSpeed(60);

      System.out.println("Current speed: " + myCar.getSpeed());

      myCar.setSpeed(-20);
      System.out.println("After trying negative speed "+myCar.getSpeed());
   }
}
