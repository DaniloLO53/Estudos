package study.random.Collections.COL2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(new Smartphone("AAA", "Motorola", "8", 2000.00));
        smartphones.add(new Smartphone("AAB", "IPhone", "32", 10_000.00));
        smartphones.add(new Smartphone("AAC", "Samsung", "8", 4000.00));
        smartphones.add(new Smartphone("AAD", "Xiaomi", "16", 8000.00));

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println(smartphones);

    }
}
