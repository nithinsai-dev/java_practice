package InterfacesAsAbstraction;

public class Fish implements Prey, Predator{

    public void hunt(){
        System.out.println("The fish is hunting");
    }

    public void flee(){
        System.out.println("The fish is fleeing");
    }

}
