package AbstractClasses;

public class Circle extends Shape {

    double radius;
    Circle(Double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
}
