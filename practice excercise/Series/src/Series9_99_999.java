import java.util.Scanner;

public class Series9_99_999 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum += (Math.pow(10,i)-1);
        }
        System.out.print("sum : " + sum);
        scanner.close();
    }
}
