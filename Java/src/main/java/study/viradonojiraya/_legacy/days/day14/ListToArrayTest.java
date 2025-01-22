package study.viradonojiraya._legacy.days.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArr = numbers.toArray(new Integer[0]);

        Integer[] intArr = new Integer[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;

        List<Integer> arrToList = Arrays.asList(intArr);
    }
}
