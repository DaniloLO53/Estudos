package study.viradonojiraya.optional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    private static List<String> names = new ArrayList<>(List.of("Danilo", "Cássia", "Eliane", "Adelino"));

    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Fulfilled String");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        Optional<String> name = findName("danilo"); // we don't know if it's null
        name.ifPresent(s -> System.out.println(s));
        System.out.println(name.isEmpty());
    }

    // it avoids nullPointerException
    private static Optional<String> findName(String name) {
        int index = names.indexOf(name);
        if(index >= 0) return Optional.of(names.get(index));

        return Optional.empty();
    }
}
