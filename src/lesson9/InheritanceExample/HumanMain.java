package lesson9.InheritanceExample;

public class HumanMain {
    public static void main(String[] args) {

        Human hum = new Human();
        Man m = new Man();
        Boy boy = new Boy();
       // Woman w = new Woman();

        Human human = new Human("Peter");
        Man man = new Man("Adam", "Hunting");
        Woman woman = new Woman("Eve", "Red");
        Woman woman1 = new Woman("Lilit");

        System.out.println(human.name);
        System.out.println(man.name);
        System.out.println(woman.name);
        System.out.println(woman1.name);

        human.talk("high");
        human.walk();

        man.talk();
        man.walk();

        woman.talk("gentle");
        woman.walk();

        man.repair();
        woman.cook();
    }
}
