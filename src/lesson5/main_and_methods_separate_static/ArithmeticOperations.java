package lesson5.main_and_methods_separate_static;

public class ArithmeticOperations {

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
}
