package Learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxFinder {

    // Your generic method here
    public static <T extends  Comparable<T>> T findMax(T[] anArray){
       return Arrays.stream(anArray)
               .max(Comparable::compareTo)
               .orElse(null);

    }

    public static void main(String[] args) {
        // Test your method with different types of arrays
        Integer[] intArray = {11,1, 3, 5, 2, 8};
        Double[] doubleArray = {2.4, 1.1, 5.0, 3.3};
        String[] stringArray = {"apple", "orange", "banana", "grape"};

        // Call your generic method and print the result
        System.out.println("Maximum integer: " + findMax(intArray));
        System.out.println("Maximum double: " + findMax(doubleArray));
        System.out.println("Maximum string: " + findMax(stringArray));
    }
}
