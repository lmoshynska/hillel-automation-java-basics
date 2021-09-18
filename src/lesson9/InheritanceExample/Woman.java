package lesson9.InheritanceExample;

public class Woman extends Human {

    public Woman() {
        System.out.println("I'm a woman");
    }

    public Woman(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("I'm talking too much");
    }
    public void walk() {

        System.out.println("I'm walking graciously");
    }

    public void cook() {
        System.out.println("Where is my apron?");
    }
}
