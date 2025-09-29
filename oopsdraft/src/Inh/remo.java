package Inh;
import java.util.*;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("person constructor called!");
    }

    void displayInfo(){
        System.out.println("name: "+name+" ,Age"+age);
    }
}
class Employee extends Person{
    double salary;

    Employee(String name,int age,double salary){
        super(name,age);
        this.salary = salary;
        System.out.println("Employee  constructor called!");
    }

    void displayEmployee(){
        displayInfo();
        System.out.println("Salary" + salary);
    }
}

public class remo {
    public static void main(String []args){
        Employee e1 = new Employee("raj",30,50000);
        e1.displayEmployee();
    }
}
