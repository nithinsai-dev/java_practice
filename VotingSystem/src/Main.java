// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //  single scanner, outside loop
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("   1) Voting");
            System.out.println("   2) Exit");
            System.out.print("Choice : ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                scanner.nextLine(); // clear bad input
                continue;
            }

            if (choice == 1) {
                try {
                    System.out.print("Enter Voter ID: ");
                    int voterId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Voter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Constituency: ");
                    String constituency = scanner.nextLine();

                    OnlineVoter voter = new OnlineVoter(voterId, name, age, constituency);
                    voter.verifyIdentity();

                    if (voter.isIdentityVerified()) {
                        voter.castVote(name);
                    }

                } catch (InvalidVoterException | AlreadyVotedException e) {
                    System.out.println("Voting Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Input error: Please enter valid values.");
                    scanner.nextLine();
                }

            } else if (choice == 2) {
                running = false;
                System.out.println("Exiting system. Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}