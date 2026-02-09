import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the octal number : ");
        int binary = scanner.nextInt();

        int temp = binary;
        int power = 0;
        int decimal=0;

        while(temp != 0){
            int digit = temp%10;
            int exp = (int) Math.pow(2,power);
            decimal += digit*exp;
            power++;
            temp /=10;
        }

        int octal=0;
        int place=1;

        while(decimal!=0){
            int rem = decimal%8;
            octal += rem*place;
            place *=10;
            decimal = decimal/8;
        }

        System.out.println("The octal number is " + octal);
        scanner.close();
    }
}

