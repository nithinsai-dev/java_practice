package MovieCollectionManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many movies do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Movie " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Director: ");
            String director = sc.nextLine();
            System.out.print("Rating: ");
            double rating = sc.nextDouble();
            sc.nextLine();
            movies[i] = new Movie(title, director, rating);
        }

        int choice;
        do {
            System.out.println("\n--- Movie Manager ---");
            System.out.println("1. Search by Director");
            System.out.println("2. Movies Above Rating");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Director: ");
                    String dirName = sc.nextLine();
                    boolean found = false;
                    for (Movie m : movies) {
                        if (m.getDirector().equalsIgnoreCase(dirName)) {
                            m.displayDetails();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("No movies found for director: " + dirName);
                    break;

                case 2:
                    System.out.print("Enter rating limit: ");
                    double limit = sc.nextDouble();
                    sc.nextLine();
                    boolean any = false;
                    for (Movie m : movies) {
                        if (m.getRating() > limit) {
                            m.displayDetails();
                            any = true;
                        }
                    }
                    if (!any) System.out.println("No movies above rating: " + limit);
                    break;

                case 3:
                    for (Movie m : movies) {
                        m.displayDetails();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}