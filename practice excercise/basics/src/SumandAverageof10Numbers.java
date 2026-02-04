import java.util.Scanner;

public class SumandAverageof10Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[11];

        for (int i=1;i<11;i++) {
            System.out.print("enter the number " + i + " : ");
            n[i] = scanner.nextInt();
        }
        double avg =0;
        int sum = 0;

        for (int d:n) {
            sum += d;
        }
        avg += sum/10;

        System.out.println("average is " + avg);

        scanner.close();
    }

}
