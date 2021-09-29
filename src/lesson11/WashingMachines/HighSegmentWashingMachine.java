package lesson11.WashingMachines;

public class HighSegmentWashingMachine implements WashingMachine, Dryable{
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

    @Override
    public void dry(int minutes) {
        System.out.println("I'm a washing machine. Drying is not my primary task, not sure about results");
        System.out.println("Drying for " + minutes + " minutes");
    }

    public void refreshClothes(int time) {
        System.out.println("Your clothes is about to become very fresh!");
    }

    public void selectMode(String mode) {
        switch(mode) {
            case "Linen":
                preWash(120, 90);
                wash(60, 90);
                spin(1200);
                break;
            case "Wool":
                wash(60, 30);
                spin(400);
                break;
            case "Delicate":
                wash(40, 30);
                break;
            case "Refresh":
                refreshClothes(30);
                break;
        }
    }
}
