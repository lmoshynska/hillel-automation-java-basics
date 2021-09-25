package lesson10.Shape;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract String draw();

    public String getColor() {
        return color;
    }
}
