package Basic;

public class Main {
    public static void main(String[] args){

        Car car = new Car();

        System.out.println(car.model);

        car.start();

        car.brake();
    }
}
