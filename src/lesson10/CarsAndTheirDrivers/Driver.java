package lesson10.CarsAndTheirDrivers;

public class Driver {

    String name;
    int experience;

    public Driver(String name, int exp) {
        this.name = name;
        this.experience = exp;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
