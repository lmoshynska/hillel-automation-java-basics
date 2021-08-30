package lesson5;

public class OverloadingExamples {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(1,2.0,3));
        System.out.println(sumOfNumbers(1,2,3));
        System.out.println(sumOfNumbers(1, 2.0f));
        System.out.println(sumOfNumbers(10L,5L,7));
        System.out.println(sumOfNumbers(1.2f, 3.4f, 5.6f));
    }

    public static int sumOfNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static double sumOfNumbers(double a, double b, double c) {
        return a + b + c;
    }

    public static double sumOfNumbers(double foo, float bar, double baz) {
        return foo + bar + baz;
    }

    public static float sumOfNumbers(int a, float b) {
        return a + b;
    }

//    public static float sumOfNumbers(int foo, float bar) {
//        return foo + bar;
//    }

}
