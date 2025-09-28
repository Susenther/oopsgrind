
import java.util.*;
public class Main{
        public static void main(String []args){
            BankAccount acc = new BankAccount(1000);
            acc.deposit(500);
            acc.withdraw(300);
            System.out.println("Final Balance: " + acc.getBalance());
        }

    }
    class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0)balance += amount;
    }
    public void withdraw(double amount){
        if(amount>0 && balance >= amount)balance -= amount;
    }
}

