package lesson10.Shape;

public class Circle extends Shape{

    String coordinates;

    public Circle(String color, String coordinates) {
        super(color);
        this.coordinates = coordinates;
    }

    @Override
    public String draw() {
        return "Coordinates: " + this.coordinates + " Color: " + getColor();
    }
}
