package Q1;

public class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder,double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

     public void display() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
     }

     public void withdraw(double amount) {
        balance = balance - amount;
         System.out.println("Withdraw Amount: " + amount);
     }
}
