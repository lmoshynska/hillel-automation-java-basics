package homework;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        //task that returns num of letter in a given color
        System.out.println("red, blue, green, yellow, orange, black, white, pink");
        Scanner input = new Scanner(System.in);
        System.out.println("Type some color from the above mentioned ones:");
        String color = input.nextLine();

        switch (color) {
            case "red":
                System.out.println("Word consists of 3 letters");
                break;
            case "blue":
            case "pink":
                System.out.println("Word consists of 4 letters");
                break;
            case "green":
            case "black":
            case "white":
                System.out.println("Word consists of 5 letters");
                break;
            case "yellow":
            case "orange":
                System.out.println("Word consists of 6 letters");
                break;
            default:
                System.out.println("Input is not valid");
        }

        //task to print the season for a given month
        System.out.println("Enter number of month:");

        if (!input.hasNextInt()) {
            System.out.println("Input is not valid!");
        } else {
            int month = input.nextInt();

            switch (month) {
                case 1:
                case 2:
                case 12:
                    System.out.println("It's Jingle Bells season!");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("It's Here Comes the Sun season!");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("It's Cool for the Summer season!");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("It's Wake Me Up When September Ends season!");
                    break;
                default:
                    System.out.println("Sorry, input is not valid!");

            }
        }
    }
}
