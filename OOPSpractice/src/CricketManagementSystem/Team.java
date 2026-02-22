package CricketManagementSystem;

public class Team {
    private String teamName;
    private Player[] players;
    private int count=0;

    public Team(String teamName,int size){
        this.teamName = teamName;
        players= new Player[size];
    }

    public void addPlayer(Player p){
        if (count < players.length){
            players[count] = p;
            count ++;
        }
        else {
            System.out.print("The team is full");
        }
    }

    public void showTeam(){
        System.out.println("Team " + teamName );
        for (int i=0;i<=count;i++){
            System.out.print(players[i] + " ");
        }
    }
}
