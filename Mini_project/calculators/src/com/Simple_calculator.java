package com;

import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("enter the first number : ");
        num1 = scanner.nextInt();
        System.out.print("enter the second number : ");
        num2 = scanner.nextInt();

        System.out.print("Enter the operator(+ , - , * , / , ^) : ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Not a valid operator");
                validOperation = false ;
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
        }
        if (validOperation){
            System.out.printf("The result is %.2f" , result);
        }

        scanner.close();
    }
}