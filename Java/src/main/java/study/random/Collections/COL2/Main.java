package study.random.Collections.COL2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SmartphonesBySerialNumberComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getSerialNumber().compareTo(smartphone2.getSerialNumber());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(new Smartphone("AAD", "Xiaomi", "16", 8000.00));
        smartphones.add(new Smartphone("AAA", "Motorola", "8", 2000.00));
        smartphones.add(new Smartphone("AAB", "IPhone", "32", 10_000.00));
        smartphones.add(new Smartphone("AAC", "Samsung", "8", 4000.00));

        Collections.sort(smartphones);
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println("-----------------------------------------------");

        smartphones.sort(new SmartphonesBySerialNumberComparator());
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

    }
}
