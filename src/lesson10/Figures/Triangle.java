package lesson10.Figures;

public class Triangle extends Figure {

    private double sideB;

    public Triangle(double side, double sideB) {
        super(side);
        this.sideB = sideB;
    }

    public double calculateArea() {
        return (getSideA() * this.sideB) * 0.5;
    }

}
