package lesson10.CarsAndTheirDrivers;

public class CarsDriversMain {
    public static void main(String[] args) {
        Driver driver = new Driver("Michael", 30);
        Car car = new Car("BMW", "Black", driver);

        System.out.println(car);
    }

}
