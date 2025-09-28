import java.util.*;
public class Abstr{
     public static void main(String []args){
        Vehicle v = new SportsCar();
        v.start();
        v.fuel();
        MusicSystem ms  = new SportsCar();
        ms.playMusic();
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
     static class SportsCar extends Car implements MusicSystem{
        public void playMusic(){
            System.out.println("Playing music in SportsCar...");
        }
     }
   }


