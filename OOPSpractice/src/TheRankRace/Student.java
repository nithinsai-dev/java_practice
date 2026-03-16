package TheRankRace;

public class Student {
    int ID;
    String name;
    double[] marks;
    double total;
    double percentage;
    int rank;

    Student(int ID,String name,double[] marks){
        this.ID=ID;
        this.name=name;
        this.marks=marks;
        this.total=calculateTotal();
        this.percentage=calculatePercentage();
    }

    Student(int ID,String name,double[] marks,double total,double percentage,int rank){

    }

    Student(){
        this.ID=0;
    }

    public double calculateTotal(){
        double sum=0;
        for(double m:marks){
            sum += m;
        }
        return sum;
    }

    public double calculatePercentage(){
        return (total/500) * 100;
    }

    void display(){
        System.out.println("ID : " + this.ID + " | Name : " + this.name + " | total : " + this.total  +  " | rank :  " + this.rank);
    }
}
