package ZooManagementSystem;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Zookeeper keeper = new Zookeeper("Alex");

        lion.displayInfo();
        elephant.displayInfo();

        keeper.feed(lion);
        keeper.feed(elephant);

        keeper.makeAnimalSound(lion);
        keeper.makeAnimalSound(elephant);
    }
}