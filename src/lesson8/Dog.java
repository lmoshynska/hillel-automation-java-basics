package lesson8;

public class Dog {

    private String breed;
    private String color;
    private int age;

    public Dog () {
        this.breed = "Colli";
        this.color = "Orange";
        this.age = 1;
    }

    public void bark() {
        System.out.println("Woof, woof!");
    }

    public void sleep() {
        System.out.println("Dog is asleep");
    }
}
