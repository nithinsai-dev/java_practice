package MiniGames.com;

import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Question array

        String [] questions = {"What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"};

        // Options array(2D)

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        //declare variables

        int score = 0 ;
        int guess;
        int[] answers = {3, 1, 2, 4, 3};

        //Welcome message
        System.out.println("*******************************");
        System.out.println("Welcome to the quiz game");
        System.out.println("*******************************");

        //question on loop
        for (int i = 0; i < questions.length ; i ++){
            System.out.println();
            System.out.println(questions[i]);

            //  options

            for (int j =0 ; j < options[i].length ;j++){
                System.out.println(options[i][j]);
            }
            System.out.println();
            //  get guess

            System.out.print("Enter the answer (option number) : ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                score ++;
            }

        }

        // display final messages

        System.out.println();
        System.out.println("********************");
        System.out.println("Your score is " + score);
        System.out.println("********************");
        scanner.close();
    }
}