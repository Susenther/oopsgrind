package Inh;
import java.util.*;
class Person{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name : "+ name + ",Age : "+age);
    }
}

class Employee extends Person{
    double salary;

    void displayEmployee(){
        displayInfo();
        System.out.println("Salary: "+salary);
    }
}
class Student extends Person{
    String course;

    void displayStudent(){
        displayInfo();
        System.out.println("Course: "+course);
    }

}

public class Demo {
    public static void main(String []args){
        Employee e1 = new Employee();
        e1.name = "raj";
        e1.age = 30;
        e1.salary = 5000;
        e1.displayEmployee();

        Student s1 = new Student();
        s1.name = "ram";
        s1.age = 18;
        s1.course = "EEE";
        s1.displayStudent();

    }
}
