package N_SidedPolygon;

public class Polygon {
    private int n =3;
    private double length = 1;
    private double x =0;
    private double y =0;

    Polygon() {
        this.n = 3;
        this.length = 1;
        this.x =0;
        this.y =0;
    }

    Polygon(int n, double length) {
        this.n = n;
        this.length = length;
        this.x = 0;
        this.y = 0;
    }

    Polygon(int n, double length, double x, double y) {
        this.n = n;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){
        return this.n*this.length;
    }

    public double getArea(){
        double numerator = this.n*Math.pow(this.length,2);
        double denominator = 4 * Math.tan(Math.PI/this.n);
        return numerator/denominator;
    }


}
