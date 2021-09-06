package lesson6;

public class WrappersExamples {

    public static void main(String[] args) {

        //creating objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        //converting values
        System.out.println(myInt.floatValue());
        System.out.println(myDouble.intValue());
        System.out.println(myChar.charValue());

        //using class methods to convert Integer, String
        String number = "10";
        int result = Integer.parseInt(number);
        Integer objResult = Integer.valueOf(number);

        int c = 1234;
        String str3 = String.valueOf(c);
        int a = 55;
        String str1 = Integer.toString(a);

    }
}
