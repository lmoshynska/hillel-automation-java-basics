package lesson10.Figures;

public class Square extends Figure{

    public Square(double side) {
        super(side);
    }

    public double calculateArea() {
        return getSideA() * getSideA();
    }

}
