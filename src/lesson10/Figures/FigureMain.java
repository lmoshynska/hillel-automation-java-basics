package lesson10.Figures;

public class FigureMain {

    public static void main(String[] args) {
        Figure square = new Square(4);
        Figure rectangle = new Rectangle(2,4);
        Figure triangle = new Triangle(2, 4);
        Figure circle = new Circle(5);

        Figure[] figures = {square, rectangle, triangle, circle};

        for (Figure figure : figures) {
            System.out.println("I'm a " + figure.getFigureName(figure) + ", my area is: " + figure.calculateArea());
        }
    }
}
