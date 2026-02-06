import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number : ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("The positive divisor : ");

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println();
        System.out.println("The sum of the divisor is : " + sum);

        if (sum == n) {
            System.out.println("So, the number is perfect.");
        } else {
            System.out.println("So, the number is not perfect.");
        }
    }
}
