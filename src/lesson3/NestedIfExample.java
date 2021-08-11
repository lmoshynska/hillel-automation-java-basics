package lesson3;

import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number and press ENTER:");
        int number = input.nextInt();

        if (number > 0) {
            if (number < 10) {
                if (number % 2 == 0) {
                    System.out.println("Your number is between 0 and 10 and even");
                }
            }
        }

        // How can we simplify and get the same result?

        /*You have 3 numbers, calculate, which is the greatest
        Print result into console*/
//        System.out.println("Input first number and press ENTER:");
//        int first = input.nextInt();
//        System.out.println("Input second number and press ENTER:");
//        int second = input.nextInt();
//        System.out.println("Input third number and press ENTER:");
//        int third = input.nextInt();
//
//        if (first > second) {
//            if (first > third) {
//                System.out.println("first: " + first);
//            }
//        }
//        if (second > first) {
//            if (second > third) {
//                System.out.println("second: " + second);
//            }
//        }
//        if (third > first) {
//            if (third > second) {
//                System.out.println("third: " + third);
//            }
//        }

    }
}















//        if (first > second && first > third) {
//            System.out.println("first: " + first);
//        } else if (second > first && second > third) {
//            System.out.println("second: " + second);
//        } else {
//            System.out.println("third: " + third);
//        }