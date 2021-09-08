package lesson6;

public class CharacterExamples {

    public static void main(String[] args) {
        char value1 = '9';
        char value2 = 'Y';
        char value3 = ' ';

        // See if these characters are digits.
        boolean isDigit = Character.isDigit(value1);
        System.out.println(isDigit);
        System.out.println(Character.isDigit(value2));
        System.out.println(Character.isDigit(value3));

        String value = "abc123";
        // Loop through characters in this String.
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            // See if the character is a letter or not.
            if (Character.isLetter(c)) {
                System.out.println(c + " = LETTER");
            } else {
                System.out.println(c);
            }
        }

        char value4 = 'U';
        char value5 = '9';
        char value6 = 'w';
        char value7 = '*';
        System.out.println(Character.isLetterOrDigit(value4));
        System.out.println(Character.isLetterOrDigit(value5));
        System.out.println(Character.isLetterOrDigit(value6));
        System.out.println(Character.isLetterOrDigit(value7));

        // Test these characters for whitespace.
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('Q'));
    }
}
