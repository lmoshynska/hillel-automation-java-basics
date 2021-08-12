package lesson4;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println("*");
            i += 2;
        }

        int j = 10;

        while (j > 0) {
            System.out.println(j);
            j--;
        }

        //do-while example
        /*Scanner scan = new Scanner(System.in);
        int number1, number2, choice;

        do {
            System.out.print("Enter the first number ");
            number1 = scan.nextInt();

            System.out.print("Enter the second number ");
            number2 = scan.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);

            System.out.print("Do you want to continue? Type 1 for yes/ type 2 for no? ");
            choice = scan.nextInt();

            System.out.println();

        } while(choice == 1);*/
    }
}
