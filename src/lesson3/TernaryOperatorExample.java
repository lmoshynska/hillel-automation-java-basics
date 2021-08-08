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
    }
}
