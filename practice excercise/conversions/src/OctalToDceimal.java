import java.util.Scanner;

public class OctalToDceimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the octal number : ");
        int octal = scanner.nextInt();

        int temp = octal;
        int power = 0;
        int decimal=0;

        while(temp != 0){
            int digit = temp%10;
            int exp = (int) Math.pow(8,power);
            decimal += digit*exp;
            power++;
            temp /=10;
        }
        System.out.println("The decimal number is " + decimal);

        scanner.close();
    }
}
