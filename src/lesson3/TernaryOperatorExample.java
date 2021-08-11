package lesson3;

import java.util.Scanner;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double mark = input.nextDouble();

        // ternary operator checks if your mark is greater than 40
        String result = (mark > 40) ? "pass" : "fail";
        System.out.println("You " + result + " the exam.");

        System.out.println("Enter your age: ");
        int yourAge = input.nextInt();
        int currentYear = 2021;

        int graduationYear = (yourAge > 25) ? currentYear + 3 : currentYear + 5;
        System.out.println("You will graduate in: " + graduationYear);
    }
}
