
import java.util.Scanner;

public class ElectrictybillingSystem {
    public static void main(String[] args) {
        int base = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the units : ");
        int units = scanner.nextInt();

        double amount = 10;
        boolean payment;

        if (units < 0) {
            System.out.println("Invalid input");
            payment = false;
        }
        else {
            System.out.print("Payment late (true/false) : ");
            payment = scanner.nextBoolean();

            if (units <= 100) {
                amount += units * 0.5;
            }
            if (units > 100 && units <= 300) {
                amount += 100 * 0.5;
                amount += (units - 100) * 0.75 ;
            }
            if (units > 300) {
                amount += 100 * 0.5;
                amount += 200 * 0.75;
                amount += (units - 300) * 1.2 ;
            }

            if (payment) {
                amount += 0.05 * amount ;
            }
            System.out.printf("%.2f" , amount);
        }

    }

}
