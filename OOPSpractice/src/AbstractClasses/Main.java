package AbstractClasses;

public class Main {
    public static void main(String[] args){

        Circle circle = new Circle(20.0);
        Triangle triangle = new Triangle(12.0,7.0);

        System.out.println(circle.area());
        System.out.println(triangle.area());

        circle.display();
        triangle.display();
    }
}
