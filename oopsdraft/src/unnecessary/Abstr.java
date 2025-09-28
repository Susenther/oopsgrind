package unnecessary;
import java.util.*;
public class Abstr{
     public static void main(String []args){
        Car v = new SportsCar();
        SportsCar s = new SportsCar();
        v.start();
        v.fuel();
        MusicSystem ms  = new SportsCar();
        ms.playMusic();
         s.gunSounds();
        
     }

    static abstract class Vehicle{
        abstract void start();
        void fuel(){
            System.out.println("Fueling");
        }
     }
     static class Car extends Vehicle{
        void start(){
            System.out.println("Car is starting with key...");
        }
     }
     interface MusicSystem{
        void playMusic();

     }
     interface modified{
      void gunSounds();
     }
     static class SportsCar extends Car implements MusicSystem,modified{
        public void fuel(){
            System.out.println("Playing music in SportsCar...");
        }
        public  void playMusic(){
             System.out.println("car is flying..");
         }
         public void gunSounds(){
            System.out.println("Car is Screaming loud ");
         }
     }
   }


