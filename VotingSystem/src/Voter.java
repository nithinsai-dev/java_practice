public abstract class Voter {
    int voterId;
    String name;
    int age;
    String constituency;

    Voter(int voterId, String name, int age, String constituency) {
        this.voterId = voterId;
        this.name= name;
        this.age = age;
        this.constituency = constituency;
    }

    public void displayVoterDetails() {
        System.out.println("Voter ID   : " + voterId);
        System.out.println("Voter Name : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Constituency: " + constituency);
    }

    public void isEligibleToVote(){
        if(age>18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public abstract void castVote(String name) throws InvalidVoterException, AlreadyVotedException;
}
