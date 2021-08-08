package lesson3;

public class StringLengthExample {

    public static void main(String[] args) {
        String exampleString = "Hello";
        String exampleEmptyString = "";
        int exampleStringLength = exampleString.length();
        int exampleEmptyStringLength = exampleEmptyString.length();

        System.out.println("exampleString value consists of " + exampleStringLength + " letters");
        System.out.println("exampleEmptyString value consists of " + exampleEmptyStringLength + " letters");
    }
}
