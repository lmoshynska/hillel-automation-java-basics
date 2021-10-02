package lesson12;

public class DeliveryMain {

    public static void main(String[] args) {
        Delivery delivery = new Delivery();

        delivery.listAllOptionsForDelivery(City.DNIPRO);

        for (City city : City.values()) {
            delivery.listAllOptionsForDelivery(city);
            System.out.println("=======================");
        }
    }
}
