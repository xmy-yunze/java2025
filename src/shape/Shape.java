package shape;

public class Shape {
    /**
     * 周长
     */
    private double perimeter;
    /**
     * 面积
     */
    private double area;

    public Shape() {
    }

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
