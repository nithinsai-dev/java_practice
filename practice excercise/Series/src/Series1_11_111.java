import java.util.Scanner;

public class Series1_11_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of terms : ");
        int n = sc.nextInt();

        int sum = 0;
        int term = 0;

        for (int i = 1; i <= n; i++) {
            term = term * 10 + 1;   // builds 1, 11, 111, ...
            sum += term;

            System.out.print(term);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("The Sum is : " + sum);
    }
}

