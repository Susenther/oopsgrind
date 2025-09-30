package encaps;
import java.util.*;

class Parent{
    String role = "Parent role";

Parent(String msg){
    System.out.println("Parent constructor called with message: "+msg);
  }

void showMessage(){
    System.out.println("Message from parent method");
 }
}

class Child extends Parent{
    String role = "Child role";

    Child(String msg){
        super(msg);
        System.out.println("Child constructor called with message: "+msg);
    }

    void showmessage(){
        super.showMessage();
        System.out.println("Message from child method");
    }

void displayRoles(){
    System.out.println("child role" + role);
    System.out.println("Parent role:"  + super.role);

 }    
}

public class sup {
    public static void main(String []args){
        Child c = new Child("Hello from main");

        System.out.println("\n----Method Overrriding with super---");
        c.showMessage();

        System.out.println("\n---Accessing variables with super---");
        c.displayRoles();
    }
}
