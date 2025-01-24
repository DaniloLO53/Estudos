package study.viradonojiraya.streams.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsIterateTest {
    public static void main(String[] args) {
        fibonacci();
    }

    static void fibonacci() {
        int[] initial = {0, 1};
        Stream.iterate(initial, pair -> new int[]{pair[1], pair[0] + pair[1]})
                .limit(10)
                .forEach(pair -> System.out.println(Arrays.toString(pair)));

        Stream.iterate(initial, pair -> new int[]{pair[1], pair[0] + pair[1]})
                .limit(10)
                .map(pair -> pair[0])
                .forEach(n -> System.out.print(n + " "));
    }
}
