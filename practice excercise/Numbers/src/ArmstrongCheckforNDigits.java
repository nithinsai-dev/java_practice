import java.util.Scanner;

public class ArmstrongCheckforNDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer : ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
