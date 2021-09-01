package lesson5;

public class MethodsExamples {

    public static void main(String[] args) {
//        int first = 2;
//        int second = 3;
//
//        int max = findMax(first, second);
//        System.out.println("Max value between numbers is: " + max);
        int num = 6;
        boolean result = isEven(num);
        System.out.println(result);
    }

    public static boolean isEven(int number) {
//        if(number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }

//        return (number % 2 == 0) ? true : false;

        return number % 2 == 0;
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
