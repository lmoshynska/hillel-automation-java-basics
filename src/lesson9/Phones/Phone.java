package lesson9.Phones;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone() {

    }

    public Phone(String num, String model) {
        this.number = num;
        this.model = model;
    }

    public Phone(String num, String model, int weight) {
        this(num, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling you! Pick up the phone");
    }

    public void receiveCall(String callerName, String callerId) {
        System.out.println(callerName + " with caller ID " + callerId + " is calling you! Pick up the phone");
    }

    public void sendMessage(String... telephoneNumbers) {
        System.out.println("A message will be sent to following numbers:");
        for (String number: telephoneNumbers) {
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
