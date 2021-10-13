package lesson15.Employee;

import java.util.Objects;

/*
* Create HashMap with 3 user defined objects Employee (id, name, city).
*  Employee is separate class with described fields and overriden
* toString(), equals() and hashcode() methods. Compare these
* 3 objects of Employee as values of maps (they need to have
* different keys)
 */
public class Employee {

    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
