package lesson3;

import java.util.Scanner;

public class IfElseifElseExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number and press ENTER:");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("The number is one");
        } else if (number == 2) {
            System.out.println("The given number is two");
        } else if (number == 3) {
            System.out.println("The number is three!");
        } else {
            System.out.println("I don't know this number!");
        }

        //order of execution for comparisons -> top to down
        //when first 'true' statement is found, the code within its block is executed, other blocks are skipped
        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number > 0) {
            System.out.println("The number is greater than zero.");
        } else if (number > 2) {
            System.out.println("The number is greater than two.");
        } else {
            System.out.println("The number is less than zero.");
        }
    }
}
