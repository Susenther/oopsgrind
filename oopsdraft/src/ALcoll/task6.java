package ALcoll;
import java.util.*;
class BankAccount{
    private int AccountNo;
    private double Balance;

    public BankAccount(int AccountNo,double Balance){
        this.AccountNo = AccountNo;
        setBalance(Balance);
    }
    public int getAccountNo(){
        return AccountNo;
    }
    public double getBalance(){
        return Balance;
    }

    public void setBalance(double Balance){
        if(Balance < 0){
            System.out.println("Balance can not be negative");
        }else{
            this.Balance = Balance;
        }
    }

        public void deposit(double amount){
            if(amount<0){
                System.out.println("Deposit must be positive");
            }else{
                Balance += amount;
                System.out.println("AmountDeposited: "+ amount + " NewBalance: "+ Balance);
            }
        }
        public void withdraw(double amount){
            if(amount<=0){
                System.out.println("amount must be positive");
            }else if(amount>Balance){
                System.out.println("Insufficient funds");
            }else{
                Balance -= amount;
                System.out.println("AmountWithdrawen: "+amount + " NewBalance: "+Balance);
            }
        }
        public void display(){
            System.out.println("AccountNo: " + AccountNo + " , Balance: "+ Balance);
        }
    

}

public class task6 {
    public static void main(String []args){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        accounts.add(new BankAccount(101,5000));
        accounts.add(new BankAccount(102,3000));
        accounts.add(new BankAccount(103,10000));

        System.out.println("===All Accounts====");
        for(BankAccount acc : accounts){
            acc.display();
        }
        System.out.println("\nEnter account number to deposit: ");
        int accNo = sc.nextInt();
        System.out.println("Enter amount to deposit: ");
        double amt = sc.nextDouble();


        for(BankAccount acc : accounts){
            if(acc.getAccountNo() == accNo){
                acc.deposit(amt);
                acc.display();
            }
        }
    }
}
