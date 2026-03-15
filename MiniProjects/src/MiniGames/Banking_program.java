package MiniGames;

import java.util.Scanner;
public class Banking_program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //BANKING PROGRAM

        //DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            //DISPLAY MENU
            System.out.println("***************");
            System.out.println("MENU");
            System.out.println("***************");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawl");
            System.out.println("4.EXIT");
            System.out.println("***************");

            //GET AND PROCESS USER CHOICE
            System.out.print("enter ur choice : ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance  += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4-> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
    }
    //show balance
    static void showBalance(double balance){
        System.out.printf("$%.2f \n",balance);
    }

    //deposit
    static double deposit(){
        double amount;
        System.out.print("Enter the amount : ");
        amount = scanner.nextDouble();
        if (amount<0){
            System.out.print("amount cant be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    //withdraw
    static double withdraw(double balance){
        double amount ;
        System.out.print("enter the amount to withdraw : ");
        amount = scanner.nextDouble();
        if (amount<0){
            System.out.print("INVALID! amount cant be negative");
            return 0;
        }
        else if(amount >balance ){
            System.out.print("INSUFFICIENT FUNDS !!");
            return 0;
        }
        else{
            return amount;
        }
    }

}

