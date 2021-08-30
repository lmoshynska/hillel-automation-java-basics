package lesson5.main_and_methods_one_class;

import java.util.Scanner;

public class ProgramWithMethodsExample {

    public static void main(String[] args) {

        //get the size of the array from user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the size of the array: ");
        int size = scan.nextInt();

        //fill in the array and print out contents
        int[] numbers = fillInArrayWithRandomNums(size);
        printArrayContents(numbers);

        //find max value
        int max = findMaxValueInArray(numbers);
        System.out.println("Max number is: " + max);

        //find average value
        int average = findAverageOfNumbers(max);
        System.out.println("Average number is: " + average);

        //visualize result
        printRectangle(max, average);
    }

    public static int[] fillInArrayWithRandomNums(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        return array;
    }

    public static void printArrayContents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int findMaxValueInArray(int[] array) {
        int maxValue = array[0];

        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static int findAverageOfNumbers(int number) {
        int sum = 0;
        int toSum = 1;

        while(toSum <= number) {
            sum += toSum;
            toSum++;
        }
        return sum / number;
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
