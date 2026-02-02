
import java.util.Scanner;

public class CharectertypeCount {
    public static void main(String[] args) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int othercharCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the String : ");
        String word = scanner.nextLine();

        for (int i=0;i<word.length()-1;i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCount += 1;
            }
            else if (Character.isLowerCase(c)) {
                lowercaseCount += 1;
            }
            else {
                othercharCount += 1;
            }
        }
        System.out.println("Number of uppercase letters are : " + uppercaseCount);
        System.out.println("Number of lowercase letters are : " + lowercaseCount);
        System.out.println("Number of other charecters are : " + othercharCount);

        scanner.close();
    }
}
