package lesson11.WashingMachines;

public interface WashingMachine {
    int MAX_POWDER = 400;

    void preWash(int time, int temperature);
    void wash(int time, int temperature);
    void spin(int rpm);

    default void addWashingPowder(int powderAmount){
        if(powderAmount > MAX_POWDER) {
            System.out.println("Add less powder!");
            return;
        }
        System.out.println("We're good! Let's wash!");
    }

    static void aboutMe() {
        System.out.println("I'm a washing machine!");
    }
}
