import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class OnlineVoter extends Voter implements Verifiable  {

    public static final int MAX_VOTES_PER_VOTER = 1;
    private boolean hasVoted = false;
    private boolean identityVerified = false;

    OnlineVoter(int voterId, String name, int age, String constituency) {
        super(voterId, name, age, constituency);
    }

    public boolean isIdentityVerified(){
        return identityVerified;
    }

    @Override
    public void verifyIdentity() {
        int otp = new Random().nextInt(1000,9999);
        System.out.println("The otp is "+ otp );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the otp : ");

        try{
            int enteredOTP = scanner.nextInt();
            scanner.nextLine();
            if (enteredOTP == otp){
                System.out.println("Identity verified.");
                identityVerified = true;
            } else {
                System.out.println("Identity verification failed.");
            }
        } catch (InputMismatchException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    @Override
    public void castVote(String name) throws InvalidVoterException,AlreadyVotedException {
        // Strict enforcement: Check age first
        if (age < 18) {
            throw new InvalidVoterException("Invalid Age");
        }

        if(hasVoted){
            throw new AlreadyVotedException("You have Already voted");
        }

        if(!identityVerified){
            System.out.println("You have not verified yet");
        }

        System.out.println("You have voted");
        hasVoted = true;
        saveVoteToFile(name);
    }

    public void saveVoteToFile(String name){
        String fileName = "Votes.txt";

        try {
            FileWriter fw = new FileWriter(fileName,true);
            //BufferedWriter bw = new BufferedWriter(fw);

            fw.write("Voted: " + name + " | Voter id : " + voterId );
            fw.write("\n");
            fw.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
