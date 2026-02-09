import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String s = scanner.nextLine();

        char[] c = s.toCharArray();
        int count = 0;

        for (char k:c){
            count++;
        }

        System.out.println("The length is : " + count);
        scanner.close();
    }
}
