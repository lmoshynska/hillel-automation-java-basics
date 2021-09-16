package lesson8;

public class Student {

    private String name;
    private int age;

    private static int countStudents = 0;

    public Student(String n, int a) {
        this.name = n;
        this.age = a;
        countStudents++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int newCount) {
        countStudents = newCount;
    }

    public void printName(String studentName) {
        System.out.println("My name is " + studentName);
    }

    public static void printHello(String studentName) {
        System.out.println("Hello " + studentName + "! Welcome!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
