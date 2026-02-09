import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String s = scanner.nextLine();

        char[] c = s.toCharArray();


        System.out.println("the reverse word is : ");
        for (int i =c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }

        scanner.close();
    }
}

