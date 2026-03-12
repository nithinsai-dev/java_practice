package ZooManagementSystem;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}