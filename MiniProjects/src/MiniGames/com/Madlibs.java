package MiniGames.com;

import java.util.Scanner;
public class Madlibs {
    public static void main(String[] args){
        // mad libs game

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("enter an adjective (description) : ");
        adjective1 = scanner.nextLine();
        System.out.print("enter the noun (animal or person) : ");
        noun1 = scanner.nextLine();
        System.out.print("enter the adjective (description) : ");
        adjective2 = scanner.nextLine();
        System.out.print("enter the verb (end with -ing) : ");
        verb1 = scanner.nextLine();
        System.out.print("enter the adjective (description) : ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday i went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit I saw a " + noun1);
        System.out.println(noun1 + "was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3);

        scanner.close();
    }
}

