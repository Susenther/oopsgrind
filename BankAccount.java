import java.util.*;

class Main{
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

public class BankAccount{
    private final String owner;
    private double balance;
    private final List<String> txn = new ArrayList<>();

    public BankAccount(String owner,double initialBalance){
        if(owner == null || owner.isEmpty())
        throw new IllegalArgumentException("owner required");
        if(initialBalance < 0)
        throw new IllegalArgumentException("initialbalance >= 0");
        this.owner = owner;
        this.balance = initialBalance;
        txn.add("Account opened: " + initialBalance);
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

    public void deposit(double amount){
        if(amount <= 0)throw new IllegalArgumentException("amount > 0");
        balance += amount;
        txn.add("Deposit: "+amount);
    }

    public void withdraw(double amount){
        if(amount <= 0)throw new IllegalArgumentException("amount > 0");
        if(amount > balance)throw new IllegalStateException("insufficient funds");
        balance -= amount;
        txn.add("Withdraw: " + amount);
    }

    public List<String> getTransactions(){
        return Collections.unmodifiableList(txn);
    }
}