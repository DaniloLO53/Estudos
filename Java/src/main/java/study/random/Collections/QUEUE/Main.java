package study.random.Collections.HASHSET;

import java.util.*;

class SmartphoneComparatorByModel implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("AAA1", "IPhone", 10_000.00);
        Smartphone xiaomi = new Smartphone("AAA2", "Xiaomi", 8000.00);
        Smartphone sony = new Smartphone("AAA3", "Sony", 4000.00);
        Smartphone motorola = new Smartphone("AAA4", "Motorola", 3000.00);
        Smartphone sonyEricsson = new Smartphone("AAA5", "SonyEricsson", 2500.00);
        Smartphone nokia = new Smartphone("AAA6", "Nokia", 1500.00);
        Smartphone nokia2 = new Smartphone("AAA6", "Nokia 2", 3000.00);

        Set<Smartphone> smartphones = new HashSet<>();
        smartphones.add(iphone);
        smartphones.add(xiaomi);
        smartphones.add(sony);
        smartphones.add(motorola);
        smartphones.add(sonyEricsson);
        smartphones.add(nokia);
        smartphones.add(nokia2);

        List<Smartphone> expansiveSmartphones = new ArrayList<>();

        for (Smartphone smartphone : smartphones) {
            if (smartphone.getPrice() > 3000) {
               expansiveSmartphones.add(smartphone);
            }
        }
        System.out.println(expansiveSmartphones);

        Iterator<Smartphone> iterator = expansiveSmartphones.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() > 8000) {
                iterator.remove();
            }
        }
        System.out.println(expansiveSmartphones);
    }


}
