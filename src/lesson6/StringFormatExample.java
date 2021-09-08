package lesson6;

public class StringFormatExample {

    public static void main(String[] args) {

        String str1 = String.format("%d", 101);            // Integer value
        String str2 = String.format("%s", "Hello World");   // String value
        String str3 = String.format("%f", 101.0);          // Float value
        String str4 = String.format("%.3f", 101.123456);   // Float value with 2 decimal places
        String str5 = String.format("%c", 'c');            // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str4);
        System.out.println(str5);

        String firstArg = "World";
        String secondArg = "Java";
        int thirdArg = 6;

        String complexArgsExample = String.format(
                "Hello %s, hello %s, hello lesson %d", firstArg, secondArg, thirdArg);
        System.out.println(complexArgsExample);

        System.out.printf("Hello %s, hello %s, hello lesson %d", firstArg, secondArg, thirdArg);
    }
}
