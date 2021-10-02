package lesson11.WashingMachines;

import java.util.Arrays;

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

        high.selectMode(Programs.WOOL);
        high.selectMode(Programs.LINEN);
        high.executeWashingCycle(200, Programs.DELICATE, true);
        high.executeWashingCycle(100, Programs.REFRESH, false);
        high.dry(60);

        dryer.dry(50);
    }
}
