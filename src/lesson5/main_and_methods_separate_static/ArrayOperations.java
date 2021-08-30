package lesson5.main_and_methods_separate_static;

public class ArrayOperations {

    public static int[] fillInArrayWithRandomNums(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        return array;
    }

    public static void printArrayContents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
