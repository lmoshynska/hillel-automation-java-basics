package lesson4;

public class NestedForLoopExample {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 2;

        // outer loop prints new line after each row
        for (int i = 0; i < rows; i++) {

            // inner loop prints columns
            for (int j = 0; j < cols; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        int weeks = 3;
        int days = 7;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; i++) {
            System.out.print("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; j++) {
                System.out.print("  Day: " + j);
            }
        }
    }
}
