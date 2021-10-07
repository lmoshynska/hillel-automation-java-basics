package lesson10.Print;

public class Magazine implements Printable{

    private String magazineName;

    Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public static void printMagazine(Printable print) {
        if (print instanceof Magazine) {
            System.out.println(((Magazine)print).getMagazineName());
        }
    }

    public String getMagazineName() {
        return magazineName;
    }
}
