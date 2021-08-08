package lesson3;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number and press ENTER:");
        int number = input.nextInt();

        if (number > 5) {
            System.out.println("Your number is greater than five!");
        } else {
            System.out.println("Your number is five or less!");
        }

        if ((number > 0 && number < 15) || number == 25) {
            System.out.println("This number is definitely either in interval [1..14] or is 25");
        } else {
            System.out.println("This number is NOT in interval [1..14] and definitely not 25");
        }

        if ((number > 5 && number >2 && number >0) || number == 0) {
            System.out.println("This number is greater than 5 or is 0");
        } else {
            System.out.println("This number is less than 5 and bigger than 0 or is negative");
        }
    }
}
