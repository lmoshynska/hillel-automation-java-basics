package lesson9.InheritanceExample;

public class Human {
    protected String name;

    public Human() {
        System.out.println("A human has been created!");
    }

    public Human(String name) {
        this.name = name;
    }

    public void talk(String voice) {
        System.out.println("I'm talking in a " + voice + " voice");
    }

    public void walk() {
        System.out.println("I'm walking");
    }
}
