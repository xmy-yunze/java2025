package shape;

import java.io.Serializable;

public class Triangle extends AbstractShape implements  IShape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
//        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        System.out.println(length);
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
