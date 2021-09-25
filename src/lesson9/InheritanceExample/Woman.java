package lesson9.InheritanceExample;

public class Woman extends Human {

    String favColor;

    public Woman(String name) {
        super(name);
    }

    public Woman(String name, String favColor) {
        super(name);
        this.favColor = favColor;
    }

    public void talk(String voice) {
        System.out.println("I'm talking too much but my voice is very " + voice);
    }

    public void walk() {
        System.out.println("I'm walking graciously");
    }

    public void cook() {
        System.out.println("Where is my apron?");
    }
}
