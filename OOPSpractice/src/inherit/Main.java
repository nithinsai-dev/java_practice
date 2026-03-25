package inherit;

import java.util.Scanner;

//--- MAIN MENU PROGRAM ---
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using a normal fixed-size array
        Cricketer[] team = new Cricketer[11];
        int playerCount = 0;
        int choice;

        System.out.println("Welcome to the Cricket Team Builder (Max 11 Players)");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Opener (Multilevel)");
            System.out.println("2. Add Batsman (Single)");
            System.out.println("3. Add Bowler (Hierarchical)");
            System.out.println("4. Add All-Rounder (Multiple)");
            System.out.println("5. View Team");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice >= 1 && choice <= 4) {
                if (playerCount < team.length) {
                    System.out.print("Enter Player Name: ");
                    String pName = sc.nextLine();

                    // Instantiating based on choice
                    if (choice == 1) {
                        team[playerCount] = new Opener(pName);
                    }else if (choice == 2) {
                        team[playerCount] = new Batsman(pName);
                    }else if (choice == 3) {
                        team[playerCount] = new Bowler(pName);
                    }else if (choice == 4) {
                        team[playerCount] = new AllRounder(pName);
                    }

                    playerCount++;
                    System.out.println("Player added! Slots remaining: " + (team.length - playerCount));
                } else {
                    System.out.println("Team is full! Cannot add more than 11 players.");
                }
            } else if (choice == 5) {
                System.out.println("\n--- CURRENT SQUAD ---");
                if (playerCount == 0) {
                    System.out.println("No players added yet.");
                } else {
                    for (int i = 0; i < playerCount; i++) {
                        System.out.print((i + 1) + ". ");
                        team[i].displayInfo();

                        // Checking if player is an AllRounder to show extra skill
                        if (team[i] instanceof AllRounder) {
                            ((AllRounder) team[i]).skillSet();
                        }
                    }
                }
            }
        } while (choice != 6);

        System.out.println("Exiting... Good luck with your team!");
        sc.close();
    }
}
