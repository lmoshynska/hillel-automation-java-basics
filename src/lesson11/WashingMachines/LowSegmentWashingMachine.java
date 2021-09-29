package lesson11.WashingMachines;

public class LowSegmentWashingMachine implements WashingMachine{
    @Override
    public void preWash(int time, int temperature) {
        System.out.println("Pre-washing for " + time + " minutes at " + temperature + " degrees");
    }

    @Override
    public void wash(int time, int temperature) {
        System.out.println("Washing for " + time + " minutes at " + temperature + " degrees");
    }

    @Override
    public void spin(int rpm) {
        System.out.println("Spinning at " + rpm + " RPM");
    }
}
