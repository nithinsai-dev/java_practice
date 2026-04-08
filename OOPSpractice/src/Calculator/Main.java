package Calculator;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double n1Value =  scanner.nextDouble();

        System.out.print("Enter the first number : ");
        double n2Value =  scanner.nextDouble();

        Number n1 = new Number(n1Value);
        Number n2 = new Number(n2Value);

        System.out.println("Select operation : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("op : ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation){
            case '+' -> result = n1.add(n2);
            case '-' ->  result = n1.subtract(n2);
            case '*' -> result = n1.multiply(n2);
            case '/' -> result = n1.divide(n2);
            default -> {
                System.out.println("Invalid operation");
                break;
            }
        }

        System.out.println("The result is : " + result);

        scanner.close();
    }
}
