package lesson9.InheritanceExample;

public class Man extends Human {

    public Man() {
        System.out.println("I'm a man");
    }

    public Man(String name) {
        super(name);
    }

    public void talk() {

        System.out.println("I'm not a talking type");
    }
    public void walk() {

        System.out.println("I'm quite clumsy");
    }

    public void repair() {
        System.out.println("Give me my tools");
    }
}
