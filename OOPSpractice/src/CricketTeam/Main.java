package CricketTeam;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean isRunning = true;
        System.out.print("Enter the number of players : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Cricketer[] players = new Cricketer[count];

        for (int i=0 ;i<count;i++){
            System.out.println("Enter the name of the player "+(i+1)+": ");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Country : ");
            String country = scanner.nextLine();
            System.out.print("Age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            players[i] = new Cricketer(name,country,age);
        }

        System.out.println("-----Cricket manager-----");
        do {
            System.out.println("1.Search by country");
            System.out.println("2.Players above 35");
            System.out.println("3.Display all");
            System.out.println("4.Exit");

            System.out.println("Choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> searchCountry(players);
                case 2 -> searchAge(players);
                case 3 -> displayAll(players);
                case 4 -> isRunning = false;
            }
        }while(isRunning);

        scanner.close();
    }

    static void searchCountry(Cricketer[] players){
        System.out.print("Enter country to search : ");
        String country = scanner.nextLine();
        boolean found = false;

        for (Cricketer player:players){
            if (player.getCountry().equalsIgnoreCase(country)) {
                found = true;
                player.displayProfile();
            }
        }
        System.out.println();
        if(!found){
            System.out.println("No player found");
        }
        System.out.println();
    }

    static void searchAge(Cricketer[] players){
        System.out.println("Players above 35 : ");
        boolean found = false;
        for (Cricketer player : players){
            if (player.getAge() >= 35){
                found = true;
                player.displayProfile();
            }
        }
        System.out.println();
        if(!found){
            System.out.println("No player found");
        }
        System.out.println();
    }

    static void displayAll(Cricketer[] players){
        System.out.println();
        for (Cricketer player : players){
            player.displayProfile();
        }
        System.out.println();
    }
}
