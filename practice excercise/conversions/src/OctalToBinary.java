import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an octal number (using digit 0 - 7) : ");
        int octal = sc.nextInt();

        System.out.println("The Octal Number : " + octal);
        System.out.print("The equivalent Binary Number : ");

        int temp = octal;
        String binary = "";

        while (temp != 0) {
            int digit = temp % 10;

            switch (digit) {
                case 0: binary = "000" + binary; break;
                case 1: binary = "001" + binary; break;
                case 2: binary = "010" + binary; break;
                case 3: binary = "011" + binary; break;
                case 4: binary = "100" + binary; break;
                case 5: binary = "101" + binary; break;
                case 6: binary = "110" + binary; break;
                case 7: binary = "111" + binary; break;
            }

            temp /= 10;
        }

        System.out.println(binary);
        sc.close();
    }
}
