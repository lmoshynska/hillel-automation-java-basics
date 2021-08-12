package lesson4;

import java.util.Arrays;

public class TwoDimArrayExample {
    public static void main(String[] args) {

//        Fill our array with the following numbers
//        {{1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9},
//        {10,11,12}};
        int[][] twoDimArray = new int[4][3];

        int value = 1;

        for (int i = 0; i < twoDimArray.length; i ++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = value;
                value++;
            }
        }

        for (int[] arr : twoDimArray) {
            System.out.println(Arrays.toString(arr));
        }

        //Change value at certain index in the array
        double[][] doubleValues = {{1.5, 2.6, 3.7},
                                   {7.5, 6.4, 5.3},
                                   {9.8,  8.7, 7.6},
                                   {3.6, 5.7, 7.8}};

        doubleValues[3][1] = 100.5;

        for (double[] arr : doubleValues) {
            System.out.println(Arrays.toString(arr));
        }

        //Print the stars qty equal to each number in the array on the next line
        int[][] toTheStars = {{5, 6}, //[0, 0][0, 1]
                              {1, 2}}; //[1, 0], [1, 1]

        int stars;

        for (int i = 0; i < toTheStars.length; i++) {
            for (int j = 0; j < toTheStars[i].length; j++) {
                int counter = 0;
                stars = toTheStars[i][j];
                while (counter < stars) {
                    System.out.print("*");
                    counter++;
                }
                System.out.println();
            }
        }
    }
}
