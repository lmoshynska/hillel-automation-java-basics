package lesson6.problems_solved;

public class FindFirstRepeatingCharacter {

    // Write a Java program to find first non repeating character in a string.
    public static void main(String[] args) {
        String str = "gibblegabbler";
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++){
                if (i != j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println("The first non repeating character:" + str.charAt(i));
                break;
            }
        }
    }
}
