package Converters.com.com;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        //weight converter in java

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.print("Weight converter : \n");
        System.out.print("choice1 : lbs to kgs\n");
        System.out.print("choice2 : kgs to lbs\n");

        System.out.print("enter the weight : ");
        weight = scanner.nextDouble();


        System.out.print("enter your choice : ");
        choice = scanner.nextInt();

        if (choice == 1) {
            newWeight = weight * 0.453592;
            System.out.printf("the converted weight is %.2f kgs", newWeight);
        } else if (choice == 2) {
            newWeight = weight * 2.20462;
            System.out.printf("the converted weight is %.2f lbs", newWeight);
        } else {
            System.out.print("enter valid choice\n");
        }

        scanner.close();
    }
}
