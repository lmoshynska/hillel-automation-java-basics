package lesson3;

public class IfExample {

    public static void main(String[] args) {

        int number = 11;

        if (number > 10) {
            System.out.println("The number was greater than 10");
        }

        if (number > 10) {
            number = 9;
            System.out.println(number);
        }

        int secondNumber = 55;

        if (secondNumber != 0) {
            System.out.println("The number is not equal to 0");
        }

        if (secondNumber >= 1000) {
            System.out.println("The number is at least 1000");
        }
    }
}
