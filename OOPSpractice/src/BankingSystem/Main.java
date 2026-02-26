package BankingSystem;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean access=false;

        Account acc1 = new Account("nithin",1234,1000);
        Account acc2 = new Account("nithin",1234,20000);

        for (int i=0;i<3;i++){
            System.out.print("Enter the pin : ");
            int guess = scanner.nextInt();
            access = acc1.validate(guess);
            if (access){
                System.out.println("Authentication Successful");
                System.out.println("*".repeat(25));
                System.out.println("Welcome to the bank");
                System.out.println("*".repeat(25));
                break;
            }
        }
        if (!access){
            System.out.println("Account locked");
        }

        while(access){
            System.out.println("1.show balance");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            if(choice == 1){
                acc1.showBalance();
            }
            else if (choice == 2){
                System.out.print("Enter the amount : ");
                int amount = scanner.nextInt();
                acc1.deposit(amount);
            }

            else if(choice == 3){
                System.out.print("Enter the amount : ");
                int amount = scanner.nextInt();
                acc1.withdraw(amount);
            }
            else if(choice == 4){
                access = false ;
            }
            else {
                System.out.println("Invalid input ");
            }
        }
        scanner.close();
    }
}
