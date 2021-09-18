package lesson9.Phones;

public class PhoneMain {
    public static void main(String[] args) {
        Phone iPhone = new Phone("+380505555555", "6s", 100);
        Phone samsung = new Phone("+380501111111", "Galaxy");
        Phone xiaomi = new Phone();

        System.out.println(iPhone.getNumber());
        System.out.println(samsung.getNumber());

        iPhone.receiveCall("Peter");
        samsung.receiveCall("Jane", "+380977777777");

        iPhone.sendMessage("123", "1234", "745");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(xiaomi);
    }
}
