package lesson4;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//        }

        //we want to validate the input from user and give him not more than 5 tries for correct input
/*        Scanner scan = new Scanner(System.in);
        int time = 0;

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Please, enter time in the range of 0-24 hours!");
            time = scan.nextInt();

            if ((time < 0 || time > 24) && counter == 4) {
                System.out.println("You have run out of attempts! Exiting!");
                return;
            } else if (time < 0 || time > 24) {
                System.out.println("Your input is incorrect, try again!");
            } else {
                System.out.println("Thank you!");
                break;
            }
        }
        String timeOfDay = (time > 18) ? "Good evening" : "Good day";
        System.out.println(timeOfDay);*/
    }
}
