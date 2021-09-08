package lesson6;

public class Concatenation {
    public static void main(String[] args) {

        String hello = "Hello ";
        String world = "World!";

        String helloWorld = hello + world;
        String helloWorldConcat = hello.concat(world);

        System.out.println(helloWorld);
        System.out.println(helloWorldConcat);
    }
}
