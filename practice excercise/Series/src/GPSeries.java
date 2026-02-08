import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter the number of terms : ");
        int n = scanner.nextInt();

        System.out.print("Enter the common ratio : ");
        int r = scanner.nextInt();

        int sum = 0;

        for (int i=0;i<n;i++){
            System.out.print(a*(Math.pow(r,i)) + " ");
            sum += a*(Math.pow(r,i));
        }
        System.out.println();
        System.out.println("the sum is " + sum);

        scanner.close();
    }
}
