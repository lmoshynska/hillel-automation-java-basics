package lesson10.CarsAndTheirDrivers;

public class Car {

    String manufacturer;
    String color;
    Driver thisCarDriver;

    public Car(String whoMakesIt, String color, Driver driver) {
        this.manufacturer = whoMakesIt;
        this.color = color;
        if(driver == null) {
            System.out.println("This car can't go without a driver!");
        } else {
            this.thisCarDriver = driver;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", thisCarDriver=" + thisCarDriver +
                '}';
    }
}
