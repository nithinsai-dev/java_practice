import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int terms = scanner.nextInt();
        double sum=0;

        for (int i=1;i<=terms;i++){
            sum += 1.0/i;
        }
        System.out.print("sum : " + sum);

        scanner.close();
    }
}
