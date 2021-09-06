package lesson6.problems_solved;

public class CountDigitsInString {

    public static void main(String[] args) {
        String toCheck = "Hello1world25nice2seeYou";
        int digitsInStr = countDigitsInStr(toCheck);
        System.out.println("Digits q-ty in this string is: " + digitsInStr);
    }

    public static int countDigitsInStr(String str) {
        int digitsCount = 0;

        // first way - loop through the String, use ASCII character representation to check if char is within the range for digits
        // ASCII range for digits 0-9 is: 48-57
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 58 && str.charAt(i) > 47) {
                digitsCount++;
            }
        }

        // second way - loop through the String, apply method from Character class to define if the character is digit
        /*for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                digitsCount++;
            }
        }*/

        // third way - convert String into char array and loop through the array
        /*char[] charsFromString = str.toCharArray();
        for(char ch : charsFromString) {
            if(Character.isDigit(ch)) {
                digitsCount++;
            }
        }*/

        return digitsCount;
    }
}
