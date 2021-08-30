package lesson5.main_and_methods_separate_static;

import java.util.Scanner;

public class MainStaticMethodsCall {

    public static void main(String[] args) {
        //get the size of the array from user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the size of the array: ");
        int size = scan.nextInt();

        //fill in the array and print out contents
        int[] numbers = ArrayOperations.fillInArrayWithRandomNums(size);
        ArrayOperations.printArrayContents(numbers);

        //find max value
        int max = ArithmeticOperations.findMaxValueInArray(numbers);
        System.out.println("Max number is: " + max);

        //find average value
        int average = ArithmeticOperations.findAverageOfNumbers(max);
        System.out.println("Average number is: " + average);

        //visualize result
        ArrayOperations.printRectangle(max, average);
    }
}
