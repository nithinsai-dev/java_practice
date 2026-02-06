import java.util.Scanner;

public class AmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting number of range: ");
        int start = sc.nextInt();

        System.out.print("Input ending number of range : ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers in given range are: ");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            int digits = String.valueOf(num).length();
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
    }
}


