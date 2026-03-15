package MiniGames;

import java.util.Scanner;
import java.util.Random;

public class Number_guessing_game {
    public static void main(String[] args){
        int number;
        int guess;
        int attempts=0;
        int min = 1;
        int max = 100;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        number = random.nextInt(min,max+1);
        System.out.print("Number guessing game \n");
        System.out.printf("Guess a number between %d - %d",min,max);
        do{
            System.out.print("Enter the guess number : ");
            guess = scanner.nextInt();
            attempts++;
            if (number > guess){
                System.out.print("TOO LOW,Try again\n");
            }
            else if (number < guess) {
                System.out.print("TOO HIGH,Try again\n");
            }
            else{
                System.out.println("You won It is the correct number");
                System.out.println("The number of attempts is " + attempts );
            }
        }while(guess != number);

        scanner.close();
    }
}
