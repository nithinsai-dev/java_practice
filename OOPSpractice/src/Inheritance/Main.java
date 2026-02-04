package Inheritance;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plant = new Plants();

        dog.eat();
        System.out.println(cat.isAlive);
        plant.photosynthesize();
    }
}
