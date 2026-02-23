import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Upper half
        for (int i=0; i<rows; i++){
            for (int j=0; j<rows - i -1; j++){
                System.out.print(" ");
            }
            int n = 1 + 2*i;
            System.out.print("*".repeat(n));
            System.out.println();
        }

        // Lower half (FIXED spaces)
        for (int x=rows-2; x>=0; x--){
            for(int y=0; y<rows - x -1; y++){  // FIXED: -1 added
                System.out.print(" ");
            }
            int n = 1 + 2*x;
            System.out.print("*".repeat(n));
            System.out.println();
        }
        scanner.close();
    }
}
