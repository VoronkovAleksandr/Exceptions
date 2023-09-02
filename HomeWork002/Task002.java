package HomeWork002;

import java.lang.reflect.Array;

public class Task002 {
    /*
    Если необходимо, исправьте данный код
     */
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        int[] intArray = {0, 1,2,3,4,5,6,7,8,9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }

    }
}