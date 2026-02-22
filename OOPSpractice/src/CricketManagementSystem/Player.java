package CricketManagementSystem;

public abstract class Player {
    private String name;
    private int age;
    private String role;
    private int runs =0;
    private int wicket =0;

    Player(String name,int age,String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }

    public void addRuns(int r){
        runs += r;
    }

    public void addWickets(int w){
        wicket +=w;
    }

    public void showStat(){
        String stat = (role == "batsman") ? name + " | " + role + " | " + runs:name + " | " + role + " | " + wicket;
        System.out.println(stat);
    }
    abstract void play();
}
