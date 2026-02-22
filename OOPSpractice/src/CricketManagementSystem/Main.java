package CricketManagementSystem;

public class Main {
    public static void main(String[] args){
        Batsman b1 = new Batsman("virat",35);
        Bowler bw1 = new Bowler("Bumrah",34);

        b1.showStat();
        bw1.showStat();
    }
}
