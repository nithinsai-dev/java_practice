import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any Decimal number: ");
        int decimal = sc.nextInt();

        int temp = decimal;
        String hex = "";

        while (temp != 0) {
            int rem = temp % 16;

            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char)('A' + (rem - 10)) + hex;
            }

            temp /= 16;
        }

        System.out.println("The equivalent Hexadecimal Number : " + hex);
        sc.close();
    }
}
