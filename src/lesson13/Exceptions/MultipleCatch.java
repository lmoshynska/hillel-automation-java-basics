package lesson13.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatch {
    public static void main(String[] args) throws IOException {
        //Example 1
        try{
            int[] a =new int[5];
            a[5]= 30 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");

        //Example 2
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");

    // More narrow exception goes after more general exception
        String fileName = "test.txt";
  /*      try {
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (FileNotFoundException f) {// Not valid!

            f.printStackTrace();
        }*/
        FileInputStream file = new FileInputStream(fileName);
        byte x = (byte) file.read();
    }
}

