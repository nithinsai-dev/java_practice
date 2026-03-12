package ZooManagementSystem;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feed(Animal animal) {
        System.out.println(name + " is feeding " + animal.getName());
    }

    public void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}