package lesson11.WashingMachines;

public class WashingMachinesMain {

    public static void main(String[] args) {
        WashingMachine low = new LowSegmentWashingMachine();
        WashingMachine mid = new MidSegmentWashingMachine();
        HighSegmentWashingMachine high = new HighSegmentWashingMachine();

        WashingMachine compact = new CompactWashingMachine();

        DryerMachine dryer = new DryerMachine();

        WashingMachine.aboutMe();

        low.addWashingPowder(450);
        compact.addWashingPowder(350);

        mid.addWashingPowder(400);
        mid.wash(60, 50);

        high.selectMode("Wool");
        high.selectMode("Linen");
        high.dry(60);

        dryer.dry(50);
    }
}
