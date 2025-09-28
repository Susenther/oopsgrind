package necessary;
import java.util.*;

class Book{
      String Title;
      String author;
      int price;

      Book(String Title,String author,int price){
        this.Title = Title;
        this.author = author;
        this.price = price;
      }

      void display(){
        System.out.println("Title "+Title + "author "+author+ "price "+price);

      }
}



public class task1 {
    public static void main(String []args){
        Book b1 = new Book("Java oop","Suse",2000);
        b1.display();
    }

}
