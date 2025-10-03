package EXE1;
import java.util.*;
class Book{
    private String title;
    private String Author;
    private int price;
    private double ISBN;

public Book(String title,String Author,int price,double ISBN){
    this.title = title;
    this.Author = Author;
    this.price = price;
    this.ISBN = ISBN;
}

public int Getprice(){
    return  price;
}

public void Setprice(int price){
    if(price >= 0){
        this.price  = price;
    }else{
        System.out.println("Error : price cannolt be negative");
    }
}

public double getISBN(){
    return ISBN;
}

public void setISBN(){
    this.ISBN = ISBN;
}



public double applyDiscount(double percent){
    if(percent >= 0 && percent <= 100){
        double discountAmount = this.price * (percent / 100.0);
        return this.price - discountAmount;
    }else{
        System.out.println("Error : discount percentage must be between 0 and 100");
        return this.price;
    }

}

public String toString(){
  
    return "Book [Title=" + title + ", Author=" + Author + ", Price=" + price + ", ISBN=" + ISBN + "]";
}

}



public class exe1 {
    public static void main(String []args){
        Book b1 = new Book("java essentials","John doe", 29,35672);
        System.out.println("Original Book:"+b1);

        System.out.println("price after discount : "+ b1.applyDiscount(30));
        b1.Setprice(40);
        System.out.println("Book"+ b1);
    }
     
}
