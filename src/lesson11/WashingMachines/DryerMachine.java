package lesson11.WashingMachines;

public class DryerMachine implements Dryable{
    @Override
    public void dry(int minutes) {
        System.out.println("I'm a dryer machine. Your clothes will be soft and dry very soon!");
        System.out.println("Drying for " + minutes + " minutes");
    }
}
