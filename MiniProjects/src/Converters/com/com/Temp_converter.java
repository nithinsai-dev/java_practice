package Converters.com.com;

import java.util.Scanner;
public class Temp_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print("to which unit u wanna convert (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit == "C") ? (temp - 32) * 5/9 : (temp * 9/5) + 32 ;

        System.out.printf("%.2f%s",newTemp,unit);
        scanner.close();

    }
}