package unnecessary;
import java.util.*;

class BankLoser{
    public static void main (String []args){
        BankAccount account = new BankAccount("Alice",500);

        System.out.println("Owner: "+account.getOwner());
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Transaction: "+account.getTransactions());

        account.deposit(200);
        System.out.println("\nAfter depositing 200");
        System.out.println("Balance:" + account.getBalance());
        System.out.println("Transactions: "+account.getTransactions());
    }
}

