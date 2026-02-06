package OverridingMethods;

public class Fish extends Animal{

    @Override
    void move(){
        System.out.println("The animal is swimming");
    }
}
