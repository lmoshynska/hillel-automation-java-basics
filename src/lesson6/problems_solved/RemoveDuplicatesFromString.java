package lesson6.problems_solved;

public class RemoveDuplicatesFromString {

    // Write a Java program to print after removing duplicates from a given string
    public static void main(String[] args) {
        String str = "hillel";
        System.out.println(removeDuplicateChars(str));
    }

    static String removeDuplicateChars(String str1) {
        char[] arr = str1.toCharArray();
        String target = "";
        for (char value : arr){
            if ( target.indexOf(value) == -1){ // if there is no required value in the target String, -1 will be returned
                target += value;
            }
        }
        return target;
    }
}
