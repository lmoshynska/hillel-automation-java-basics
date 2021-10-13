package lesson15;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap<>();
        months.put("January", 31);
        months.put("February", 28);
        months.put("March", 31);
        months.put("April", 30);
        months.put("May", 31);
        months.put("June", 30);
        months.put("July", 31);
        months.put("August", 31);
        months.put("September", 30);
        months.put("October", 31);
        months.put("November", 30);
        months.put("December", 31);

        int a = months.getOrDefault("AAA", 5);
        int b = months.getOrDefault("February", 0);
        System.out.println(a);
        System.out.println(b);

        /*for(Map.Entry<String, Integer> entry : months.entrySet()) {
            entry.setValue(entry.getValue() + 5);
        }*/

        System.out.println(months);

        /*months.forEach((key, value) -> System.out.println(key + " : " + value));
        months.forEach((key, value) -> {
            System.out.println(key + " : " + value);
            System.out.println("Hello");
            System.out.println("World");
        } );*/

        /*months.put("January", 32);
        months.putIfAbsent("February", 30);
        months.replace("March", 32);
        months.replace("April", 30, 25);

        System.out.println(months);*/
    }

}
