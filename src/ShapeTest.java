import shape.*;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

//        circle.setRadius(4);
//        System.out.println(circle.getArea());

//        shape.Shape rectangle = new shape.Rectangle();
//        shape.Shape triangle = new shape.Triangle();
//        rectangle.setLength();
        IShape rectangle = new Rectangle(4, 5);
        IShape triangle = new Triangle(2, 2, 3);
//        System.out.println(triangle.getPerimeter());
        printShape(circle);
        printShape(triangle);
        printShape(rectangle);
    }
    public static void printShape(IShape shape) {
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
    }
}
