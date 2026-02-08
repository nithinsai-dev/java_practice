import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        boolean found = false;
        for (int i=2;i<=n/2;i++){
            if (primeNumber(i)){
                int x = n-i;
                if(primeNumber(x)){
                    System.out.println(n  + " = " + i + " + " +x );
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No pair Available");
        }

        scanner.close();
    }

    public static boolean primeNumber(int n){
        if (n<=1) return false;
        if (n<=3) return true;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}


