package lesson5.main_methods_separate_non_static;

import java.util.Scanner;

public class MainNonStaticMethodsCall {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the size of the array: ");
        int size = scan.nextInt();

        ArithmeticOperationsObj doTheMath = new ArithmeticOperationsObj();
        ArrayOperationsObj doSthWithArray = new ArrayOperationsObj();

        //fill in the array and print out contents
        int[] numbers = doSthWithArray.fillInArrayWithRandomNums(size);
        doSthWithArray.printArrayContents(numbers);

        //find max value
        int max = doTheMath.findMaxValueInArray(numbers);
        System.out.println("Max number is: " + max);

        //find average value
        int average = doTheMath.findAverageOfNumbers(max);
        System.out.println("Average number is: " + average);

        //visualize result
        doSthWithArray.printRectangle(max, average);
    }
}
