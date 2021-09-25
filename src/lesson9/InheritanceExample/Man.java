package lesson9.InheritanceExample;

public class Man extends Human {

    String hobby;

    public Man() {
        super();
        System.out.println("I'm a man");
    }

    public Man(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    public void talk() {
        super.talk("low");
        System.out.println("I'm not a talking type");
    }

    public void walk() {

        System.out.println("I'm quite clumsy");
    }

    public void repair() {
        System.out.println("Give me my tools");
    }
}
