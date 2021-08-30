package lesson2;

public class CharExample {

    public static void main(String[] args) {
        char first = 'Y';
        char second = 33;
        char third = (char) (first + second);
        int charCode = '}';

        System.out.println("I'm first char: " + first); //will print "I'm first char: n"
        System.out.println("I'm second char: " + second); //will print "I'm second char: d"
        System.out.println("I'm third char: " + third); // ?
        System.out.println("I'm an ASCII code for the given char: " + charCode);
    }
}
