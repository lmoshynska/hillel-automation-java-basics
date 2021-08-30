package lesson5;

public class MethodsExamples {

    public static void main(String[] args) {
        int first = 2;
        int second = 3;

        int max = findMax(first, second);
        System.out.println("Max value between numbers is: " + max);
    }

    public static int findMax(int a, int b) {
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
