package Calculators;

import java.util.Scanner;

public class compound_interest_calculators {
    public static void main(String[] args){
        // compound interest calculator


        Scanner scanner = new Scanner(System.in);

        double principal;
        double interest;
        int timesCompounded;
        int  years;
        double amount;

        System.out.print("Enter the  principal amount : ");
        principal = scanner.nextDouble();
        System.out.print("Enter  the interest : ");
        interest  = scanner.nextDouble()/100;
        System.out.print("Enter the number of times compounded (per year): ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years : ");
        years = scanner.nextInt();
        amount = principal * Math.pow(1 + interest / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %.2f",years,amount);


        scanner.close();
    }
}


