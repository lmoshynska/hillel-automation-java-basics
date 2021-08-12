package lesson4;

public class ArrayExample {
    public static void main(String[] args) {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        //so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Element at index 3 is: " + arr[3]);

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }

        // and with foreach loop
        for (int element : arr) {
            System.out.print(element + " ");
        }


/*        // how to loop over an integer array
        int[] primes = {2, 3, 5, 7, 11, 13, 17};

        // looping using for loop
        System.out.println("looping over an array using for loop");
        for (int i = 0; i < primes.length; i++){
            System.out.println("current element is: " + primes[i]);
        }

        // looping using enhanced for loop of Java 5
        System.out.println("looping over an array using enhanced for loop");
        for(int number: primes){
            System.out.println(number);
        }*/

    }
}
