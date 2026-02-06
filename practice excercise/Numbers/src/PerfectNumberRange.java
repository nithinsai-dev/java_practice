import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the starting range or number : ");
        int start = sc.nextInt();

        System.out.print("Input the ending range of number : ");
        int end = sc.nextInt();

        System.out.print("The Perfect numbers within the given range : ");

        for (int n = start; n <= end; n++) {
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n && n != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
