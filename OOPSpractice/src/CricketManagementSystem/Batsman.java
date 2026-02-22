package CricketManagementSystem;

public class Batsman extends Player{

    public Batsman(String name,int age){
        super(name,age,"batsman");
    }
    public void play(){
        System.out.print("The batsman is batting");
    }
}
