package BankingSystem;

public class Account {
    private String accName;
    private int accPin;
    private int balance;

    Account(String accName,int accPin,int balance){
        this.accName = accName;
        this.accPin = accPin;
        this.balance = balance;
    }

    void showBalance(){
        System.out.println("The balance is : " + balance);
    }

    void deposit(int amount){
        balance += amount;
        System.out.println("The updated balance " + balance);
    }

    void withdraw(int amount){
        if (amount > 0 && (this.balance - amount)>=1000 && this.balance > amount){
            balance -=amount;
            System.out.println("The updated balance "+ balance);
        }
        else if (amount > this.balance){
            System.out.println("invalid funds");
        }
        else if (this.balance - amount < 1000){
            System.out.println("Minimum balance is required");
        }
        else if (amount < 0){
            System.out.println("Enter the valid amount");
        }

    }

    boolean validate(int attempt){
        if (attempt == accPin){
            return true;
        }
        return false;
    }

}
