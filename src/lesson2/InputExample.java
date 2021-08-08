package lesson2;

import java.util.Scanner;

public class InputExample {

    // Java program to demonstrate working of Scanner in Java
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your name and press Enter");
        String name = scan.nextLine(); //Will expect String input and store in a respective type variable
        System.out.println("Enter your age");
        int age = scan.nextInt(); //Will expect Integer input, will store the input as an int

        System.out.println("Hello " + name + " your age is " + age);
    }
}
