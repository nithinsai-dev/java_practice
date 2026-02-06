package AbstractClasses;

public class Triangle extends Shape {
    double width;
    double height;

    Triangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return 0.5 * height * width;
    }

}
