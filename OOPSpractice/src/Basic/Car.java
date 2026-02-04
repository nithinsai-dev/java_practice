package Basic;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2004;
    double price = 25500;
    boolean isRunning = true;

    void start(){
        System.out.println("you start the car");
    }

    void stop(){
        System.out.println("you stop your car");
    }

    void drive(){
        System.out.println("you drive the car " + model);
    }

    void brake(){
        System.out.println("you brake  ur car " + model );
    }
}
