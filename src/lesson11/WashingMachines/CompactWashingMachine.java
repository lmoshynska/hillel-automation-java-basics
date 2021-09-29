package lesson11.WashingMachines;

public class CompactWashingMachine implements WashingMachine{
    private final int MAX_POWDER = 300;

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

    public void addWashingPowder(int powderAmount) {
        if(powderAmount > MAX_POWDER) {
            System.out.println("Add less powder!");
            return;
        }
        System.out.println("We're good! Let's wash!");
    }
}
