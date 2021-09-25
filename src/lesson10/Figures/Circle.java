package lesson10.Figures;

public class Circle extends Figure {

    public Circle(double side) {
        super(side);
    }

    public double calculateArea() {
        return Math.PI * Math.pow(getSideA(), 2);
    }

}