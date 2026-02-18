package GettersAndSetters;

public class Main {
    public static void main(String[] args){


        Car car = new Car("Thar","Black",2000);

        System.out.println(car.getModel());

        System.out.println(car.getPrice());

        car.setPrice(5000);

        System.out.println(car.getPrice());
    }
}
