package lesson10.Figures;

public class Rectangle extends Figure {

    private double sideB;

    public Rectangle(double side, double sideB) {
        super(side);
        this.sideB = sideB;
    }

    public double calculateArea() {
        return getSideA() * this.sideB;
    }

}
