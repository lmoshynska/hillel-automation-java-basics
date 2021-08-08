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
    }
}
