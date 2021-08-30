package lesson5.main_and_methods_one_class;

import java.util.Scanner;

public class ProgramWithoutMethodsExample {
/* Program which
    - takes size of array and fills it in with random numbers
    - prints out contents of this array
    - finds max number in this array
    - finds average of the sum of all numbers from 1 to max number
    - draws a rectangle, which takes found max number as height and found average number as width
 */
    public static void main(String[] args) {

        //get the size of the array from user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the size of the array: ");
        int size = scan.nextInt();

        //fill in the array with random integer numbers from 1 to 50 and print out the array
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
            if(i == numbers.length - 1) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + " ");
            }
        }

        //get max value out of array
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number is: " + max);

        //get average of the sum of all numbers from 1 to found max number
        int sum = 0;
        int number = 1;

        while(number <= max) {
            sum += number;
            number++;
        }
        int average = sum / max;
        System.out.println("Average number is: " + average);

        //print out a rectangle of height = max number, width = average number
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < average; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
