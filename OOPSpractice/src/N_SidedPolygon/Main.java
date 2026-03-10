package N_SidedPolygon;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Polygon p = new Polygon(4,9);

        System.out.printf("%.2f\n",p.getPerimeter());
        System.out.printf("%.2f\n",p.getArea());;
    }
}
