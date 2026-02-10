package InterfacesAsAbstraction;

public class Main {
    public static void main(String[] args){
        Rabbit r=new Rabbit();
        Fish f = new Fish();
        Hawk h = new Hawk();

        h.hunt();
        f.flee();
        f.hunt();
        r.flee();
    }
}
