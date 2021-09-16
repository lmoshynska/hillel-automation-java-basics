package lesson8;

public class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println("Car's " + model + " engine is starting");
    }
    public void stop() {
        System.out.println("Car's " + model + " engine is stopping");
    }
    public void move() {
        if(price > 200000) {
            System.out.println("This " + model +" is an expensive car! It moves very fast!");
        } else if (price <= 200000 && price > 50000)  {
            System.out.println("This " + model +" is an averagely priced car! It moves ok!");
        } else {
            System.out.println("This " + model +" is some cheap stuff! It is going to break down");
        }
    }
}
