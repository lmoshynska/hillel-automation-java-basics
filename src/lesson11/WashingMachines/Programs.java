package lesson11.WashingMachines;

public enum Programs {
    WOOL(50),
    LINEN(180),
    DELICATE(40),
    REFRESH(0);

    int dryingTime;

    Programs(int dryingTime) {
        this.dryingTime = dryingTime;
    }

    Programs() {
    }

    public int getDryingTime() {
        return dryingTime;
    }
}
