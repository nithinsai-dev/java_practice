package Polymorphism;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};

        for (Vehicle v:vehicles){
            v.go();
        }
    }
}

// POLY = "Many"
// MORPH = "shapes"

//polymorphism means a single object or method in different for example in out case each of the object
// car , bike ,boat is having their own class and  also all are vehicles , so each are taking different shapes.
// That is polymorphism.
