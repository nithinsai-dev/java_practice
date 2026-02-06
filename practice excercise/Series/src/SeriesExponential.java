import java.util.Scanner;

public class SeriesExponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of x : ");
        double x = sc.nextDouble();

        System.out.print("Input number of terms : ");
        int terms = sc.nextInt();

        double sum = 1.0;
        double fact = 1.0;
        double power = 1.0;

        for (int i = 1; i < terms; i++) {
            power = power * x;   // x^i
            fact = fact * i;     // i!
            sum = sum + (power / fact);
        }

        System.out.printf("The sum is : %.6f", sum);
    }
}
