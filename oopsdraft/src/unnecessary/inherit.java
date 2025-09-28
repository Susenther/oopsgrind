package unnecessary;
import java.util.*;
public class inherit {
    public static void main(String []args){
        Employee e1 = new Developer("Suse",60000);
        Employee e2 = new Tester("Adhi",50000);

        e1.work();
        e2.work();
    }

    static class Employee{
        String name;
        double salary;

        Employee(String name,double salary){
            this.name = name;
            this.salary = salary;
        }
        void work(){
           System.out.println(name + " is working...");
        }
    }
    static class Developer extends Employee{
        Developer(String name,double salary){
            super(name,salary);
        }
        void work(){
            System.out.println(name + " is coding...");
        }

    }
    static class Tester extends Employee{
        Tester(String name,double salary){
            super(name,salary);
        }
        void work(){
            System.out.println(name +" is testing...");
        }
    }
}
