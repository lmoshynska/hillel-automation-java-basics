package lesson9.InheritanceExample;

public class Human {
    protected String name;

    public Human() {
        System.out.println("Human was created");
    }

    public Human(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("I'm talking");
    }
    public void walk() {
        System.out.println("I'm walking");
    }
}
