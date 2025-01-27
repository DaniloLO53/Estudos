package draft;

import java.util.Arrays;

class Person {

}

public class Draft1 {

    public static void main(String[] args) {
        // Variables are in stack memory
        // Arrays objects are in Heap memory
        // Heap area ON JAVA (not on other languages) is not continuous (so the objects are not stored continuously in heap).
        // JVM takes care of the allocation
        int[] rows; // at compile time
        rows = new int[]{1,2,3}; // at run time -> dynamic memory allocation

        String[] strs = new String[]{"A", "B"};
        String x = strs[0];
        strs[0] = "A_mod";
        System.out.println(x);

        String y = "Y";
        String z = y;
        y = "Y_mod";
        System.out.println(z);

    }
}
