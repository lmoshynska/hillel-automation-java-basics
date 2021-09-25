package lesson10.Shape;

public class Rectangle extends Shape{

    String coordinates;

    public Rectangle(String color, String coordinates) {
        super(color);
        this.coordinates = coordinates;
    }

    @Override
    public String draw() {
        return "Coordinates: " + this.coordinates + " Color: " + getColor();
    }
}
