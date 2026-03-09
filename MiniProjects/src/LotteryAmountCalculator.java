import java.util.*;

public class LotteryAmountCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int lottery = random.nextInt(0, 100);
        System.out.print("Enter a two-digit number (00-99): ");
        int n = scanner.nextInt();

        // Input validation
        if (n < 0 || n > 99) {
            System.out.println("Invalid input! Please enter a number between 0 and 99.");
            return;
        }

        // Show both numbers formatted with leading zeros
        System.out.printf("Lottery number: %02d%n", lottery);
        System.out.printf("Your number:    %02d%n", n);

        int r = compare(lottery, n);

        if (lottery == n) {
            System.out.println("Exact match! You win $10,000!");
        } else if (r == 2) {
            System.out.println("All digits match! You win $3,000!");
        } else if (r == 1) {
            System.out.println("One digit matches! You win $1,000!");
        } else {
            System.out.println("No match. You win $0.");
        }

        scanner.close();
    }

    public static int compare(int a, int b) {
        int[] lotNum = new int[2];
        int[] gNum = new int[2];
        int count = 0;

        // Extract digits of lottery number
        for (int i = 0; i < 2; i++) {
            lotNum[i] = a % 10;
            a /= 10;
        }

        // Extract digits of user input
        for (int j = 0; j < 2; j++) {
            gNum[j] = b % 10;
            b /= 10;
        }

        // Count matching digits
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                if (lotNum[k] == gNum[l]) {
                    count++;
                }
            }
        }
        return count;
    }
}