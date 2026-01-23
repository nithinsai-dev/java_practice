package mini_game;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args){

        // ROCK PAPER SCISSOR GAME

        //declare variables

        String[] options = {"rock","paper","scissor"};
        String user;
        int computer;
        String  computerChoice;
        String playAgain;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){
            //user input

            System.out.print("enter your choice (rock,paper,scissor) : ");
            user = scanner.nextLine().toLowerCase() ;

            if (!user.equals("rock") &&
                    !user.equals("paper") &&
                    !user.equals("scissor")){
                System.out.println("INVALID choice");
            }

            // random choice

            computer = random.nextInt(0,3);
            computerChoice = options[computer];

            //check win conditions

            if (computerChoice.equals(user)){
                System.out.println("Its a tie");
                continue;
            }
            else if (user.equals("rock") && computerChoice.equals("scissor")){
                System.out.println("You win");
            }
            else if (user.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You win");
            }
            else if (user.equals("scissor") && computerChoice.equals("paper")){
                System.out.println("You win");
            }
            else {
                System.out.println("You lose");
            }
            //ask to play again;

            System.out.print("do u want to play again(yes/no) : ");
            playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")){
                isRunning = false;

                //exit message

                System.out.println("Thanks for playing");;
            }
        }
        scanner.close();
    }
}
