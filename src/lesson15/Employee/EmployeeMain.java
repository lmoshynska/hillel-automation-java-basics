package lesson15.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {

    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();

        employees.put(1, new Employee(1, "Peter", "Kyiv"));
        employees.put(2, new Employee(1, "Peter", "Kyiv"));
        employees.put(3, new Employee(2, "Jane", "Odessa"));

        System.out.println(employees.get(1).equals(employees.get(2)));
        System.out.println(employees.get(1).equals(employees.get(3)));
    }
}
