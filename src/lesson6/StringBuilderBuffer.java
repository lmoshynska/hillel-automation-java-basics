package lesson6;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java").append(" Lesson6"); //now original string is changed
        System.out.println(sb); //prints Hello Java Lesson6

        System.out.println(sb.indexOf("Java")); // 6
        System.out.println(sb.replace(6, 10, "World")); // Hello World Lesson6
        System.out.println(sb.delete(11,sb.length())); // Hello World
        System.out.println(sb.insert(sb.length(), " Hello Java")); //Hello World Hello Java
        System.out.println(sb.lastIndexOf("Hello")); //12
        System.out.println(sb.reverse()); // avaJ olleH dlroW olleH
    }
}
