package lesson10.Shape;

public class ShapeMain {

    public static void main(String[] args) {
        Shape one = new Circle("blue", "25.5");
        Shape two = new Rectangle("yellow", "32.7");

        Shape[] shapes = {one, two};

        for (Shape shape: shapes) {
            if(shape instanceof Circle) {
                System.out.println("I'm a circle " + shape.draw());
            } else {
                System.out.println("I'm a rectangle " + shape.draw());
            }
        }
    }
}
