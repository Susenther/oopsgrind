package unnecessary;
import java.util.*;

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

    public BankAccount(double d) {
        this("unkown",d);
        //TODO Auto-generated constructor stub
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