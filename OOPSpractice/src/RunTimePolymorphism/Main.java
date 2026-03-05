package RunTimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Enter your choice ( 1=cat 2=dog) : ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Cat();
        }
        else{
            animal = new Dog();
        }

        animal.sound();

        scanner.close();
    }
}
