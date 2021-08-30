package lesson5.main_methods_separate_non_static;

public class ArithmeticOperationsObj {

    public int findMaxValueInArray(int[] array) {
        int maxValue = array[0];

        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public int findAverageOfNumbers(int number) {
        int sum = 0;
        int toSum = 1;

        while(toSum <= number) {
            sum += toSum;
            toSum++;
        }
        return sum / number;
    }
}
