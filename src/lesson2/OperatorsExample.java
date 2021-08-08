package lesson2;

public class OperatorsExample {

    public static void main(String[] args) {
        //Unary operators
       /* int i = 10;

        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);*/

        //Arithmetic operators
        int a = 10;
        int b = 5;
        int j = 3;
        double k = 3;
        double d = 10.0;
/*
        System.out.println(a + b); //15
        System.out.println(a - b); //5
        System.out.println(a / j); //int divided by int
        System.out.println(d / j); //double divided by int
        System.out.println(a / k); //int divided by double
        System.out.println(a * d); //double multiplied by int
        System.out.println(a % b);
        System.out.println(a % j);*/

//        System.out.println(a + b * j + ++j); // ?

        //Math class
        System.out.println(Math.pow(a, b));

        //Assignment operators
        /*System.out.println(a += 1); //same as ++a, same as a = a + 1;
        System.out.println(a += 5); //a = a + 5;
        System.out.println(b *= 3); //b = b * 3;
        System.out.println(d %= 5); //d = d % 5;*/
    }
}
