package CricketManagementSystem;

public class Bowler extends Player {

    public Bowler(String name,int age){
        super(name,age,"bowler");
    }

    public void play(){
        System.out.print("THe bowler is bowling");
    }
}
