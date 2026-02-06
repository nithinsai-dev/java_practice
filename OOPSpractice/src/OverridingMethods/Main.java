package OverridingMethods;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
