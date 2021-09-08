package lesson6;

public class PoolOfStrings {

    public static void main(String[] args) {
        String first = "Hillel";
        String second = "Hillel";
        String third = new String("Hillel");

        System.out.println(first == second);
        System.out.println(second == third);
        System.out.println(second.equals(third));

        String fourth = new String("Hillel").intern();
        System.out.println(second == fourth);
    }
}
