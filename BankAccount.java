import java.util.Random;

public class BankAccount{  
    private String accountHolderName; //accountHolderName
    private String accountNumber; //accountNumber
    private double balance; //balance

    //constructor to initialize the account with a name and starting balance
    public BankAccount(String name, double initialBalance){
        Random rand = new Random();
        this.accountHolderName = name;
        this.accountNumber = String.valueOf(rand.nextInt(999999999));
        this.balance = initialBalance;
    }
    //Methods for deposit(double amount), withdraw(double amount), getBalance()
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        }else{
            System.out.println("ERROR! please enter a valid amount.");
        }
    }

    public void withdraw(double amount){
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw successful! New balance: $" + balance); 
        } else if(amount > balance){
            System.out.println("Insufficient funds!");
        }else{
            System.out.println("ERROR! please enter a valid amount.");
        }
    }

    public double getBalance(){
        return balance;
    }
}