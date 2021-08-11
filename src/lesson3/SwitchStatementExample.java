package lesson3;

import java.util.Scanner;

public class SwitchStatementExample {

    public static void main(String[] args) {

        int number = 20;

        //switch expression with int value
        switch (number) {
            //switch cases without break statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Input your favorite season: ");
        String season = input.nextLine();

        //switch expression with int value
        switch (season) {
            //switch cases without break statements
            case "Winter":
                System.out.println("Oh! Christmas is in winter!");
                break;
            case "Spring":
                System.out.println("Beautiful season! The trees begin to bloom!");
                break;
            case "Summer":
                System.out.println("Yahoo! Vacation time!");
                break;
            case "Autumn":
                System.out.println("Indian summer is the best!");
                break;
            default:
                System.out.println("Sorry, I don't know this season...");
        }
    }
}
