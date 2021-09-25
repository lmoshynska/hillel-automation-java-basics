package lesson10.Figures;

public abstract class Figure {

    private double sideA;

    public Figure(double side) {
        this.sideA = side;
    }

    public abstract double calculateArea();

    protected double getSideA() {
        return sideA;
    }

    public String getFigureName(Figure figure) {
        if(figure instanceof Square) {
            return "Square";
        } else if(figure instanceof Rectangle) {
            return "Rectangle";
        } else if(figure instanceof Triangle) {
            return "Triangle";
        } else if(figure instanceof Circle) {
            return "Circle";
        }
        return "I don't know this figure";
    }

}
