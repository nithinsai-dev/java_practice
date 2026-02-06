import java.util.Scanner;

public class SeriesX2_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of x: ");
        double x = sc.nextDouble();

        System.out.print("Input the number of terms: ");
        int n = sc.nextInt();

        double sum = 0.0;
        int sign = 1; // +1 for positive, -1 for negative

        for (int i = 0; i < n; i++) {
            int power = 2 * i;
            double term = Math.pow(x, power) / factorial(power);
            sum += sign * term;
            sign = -sign; // alternate sign
        }

        System.out.printf("the sum = %.6f%n", sum);
        System.out.println("Number of terms = " + n);
        System.out.printf("value of x = %.6f%n", x);
    }

    static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

