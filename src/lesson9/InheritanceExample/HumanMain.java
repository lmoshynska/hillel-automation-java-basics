package lesson9.InheritanceExample;

public class HumanMain {
    public static void main(String[] args) {

        Human human = new Human("John");
        Man man = new Man("Adam");
        Woman woman = new Woman("Eve");

        System.out.println(human.name);
        System.out.println(man.name);
        System.out.println(woman.name);

        human.talk();
        human.walk();

        man.talk();
        man.walk();

        woman.talk();
        woman.walk();

        man.repair();
        woman.cook();
    }
}
