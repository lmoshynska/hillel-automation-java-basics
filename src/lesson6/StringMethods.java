package lesson6;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // char array to String example
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        // String to char array example
        String helloString1 = new String("Hello");
        char[] helloArray1 = helloString1.toCharArray();
        System.out.println(Arrays.toString(helloArray1));

        // split String example
        String splitExample = "this is an example of split";
        String[] myStringArray = splitExample.split(" ");

        System.out.println(Arrays.toString(myStringArray));

        String s= "Hello World";
        // or String s= new String ("Hello world");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length()); // 11

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                + s.charAt(3)); // l

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3)); // lo World

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,7)); // llo w

        // Concatenates string2 to the end of string1.
        String s1 = "Hillel";
        String s2 = "hillel";
        System.out.println("Concatenated string  = " +
                s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Share")); // 6

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " +
                s4.indexOf('a',3)); // 8

        // Checking equality of Strings
        Boolean out = "Hillel".equals("hillel");
        System.out.println("Checking Equality  " + out);
        out = "Hillel".equals("Hillel");
        System.out.println("Checking Equality  " + out);

        out = "Hillel".equalsIgnoreCase("hiLleL");
        System.out.println("Checking Equality " + out);

        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "JavaIsGreat";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());

        // Converting cases
        String word2 = "JavaIsCool";
        System.out.println("Changing to UPPER Case " +
                word2.toUpperCase());

        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "ooo-aaaa-ooo";
        System.out.println("Original String " + str1);
        String str2 = "ooo-aaaa-ooo".replace('o' ,'u') ;
        System.out.println("Replaced o with u -> " + str2);
    }
}
