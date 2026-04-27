package Q1;

public class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Interest rate is " + this.interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount > 500) {
            balance -= amount;
            System.out.println("Withdraw Amount: " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}
