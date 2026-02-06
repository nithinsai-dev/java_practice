import java.util.Scanner;

public class AlternatePowerSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of x : ");
        int x = sc.nextInt();

        System.out.print("Input number of terms : ");
        int terms = sc.nextInt();

        int sum = 0;
        int power = x;

        System.out.println("The values of the series:");

        for (int i = 1; i <= terms; i++) {
            if (i % 2 != 0) {
                sum += power;
                System.out.println(power);
            } else {
                sum -= power;
                System.out.println(-power);
            }
            power = power * x * x;
        }

        System.out.println("The sum = " + sum);
    }
}

