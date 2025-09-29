package encaps;
import java.util.*;
class BankAccount{
    private int accountNo;
    private double balance;

     public BankAccount(int accountNo,double balance){
          this.accountNo = accountNo;
          setBalance(balance);
     }
     public int getAccountNo(){
            return accountNo;
     }
     public void setAccountNo(int accountNo){
            if(accountNo <= 0){
                System.out.println("the accountNo is invalid");
            }else{
                this.accountNo = accountNo;
            }
     }

     public double getBalance(){
        return balance;
     }

     public void setBalance(double balance){
        if(balance < 0){
            System.out.println("the balance cannot be negative");
        }else{
            this.balance = balance;
        }
        
     }
     public void deposit(double amount){
        if(amount<= 0){
            System.out.println("Deposit must be positive");
            return;
        }
           balance += amount;
           System.out.println("Deposited: " +amount + "\nNewBalance: "+amount);
     }
     public void withdraw(double amount){
        if(amount<=0){
            System.out.println("withdrawal must be positive");
         }else if(amount > balance){
            System.out.println("insufficient funds");
         }else{
            balance -= amount;
            System.out.println("AmountWithdrwan: "+amount+"\nNewbalance: " + balance);

         }
     }
     public void display(){
        System.out.println("accountNo: " + accountNo + "\nBalance: " + balance);
     }
}

public class task5 {
    public static void main(String []args){
        BankAccount b1 = new BankAccount(5682,1000);
        BankAccount b2 = new BankAccount(5683,1500);
        
        b1.deposit(1000);
        b1.withdraw(500);
        b1.display();

        b2.deposit(2000);
        b2.withdraw(200);
        b2.display();


    }
}