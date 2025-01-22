package study.viradonojiraya._legacy.days.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        Collections.sort(numbers);

        System.out.println(Collections.binarySearch(numbers, 1)); //(-(insertion point) - 1)
    }
}
