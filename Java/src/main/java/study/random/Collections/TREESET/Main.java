package study.random.Collections.TREESET;

import java.util.*;

class SmartphoneComparatorByPrice implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphonesTreeSet = new TreeSet<>(new SmartphoneComparatorByPrice());
        Set<Smartphone> smartphonesHashSet = new HashSet<>();
        List<Smartphone> smartphonesList = new ArrayList<>();

        Smartphone iphone = new Smartphone("AAA1", "IPhone 15", 10_000.00);
        Smartphone xiaomi = new Smartphone("AAA2", "Xiaomi", 8000.00);
        Smartphone sony = new Smartphone("AAA3", "Sony", 4000.00);
        Smartphone motorola = new Smartphone("AAA4", "Motorola", 3000.00);
        Smartphone sonyEricsson = new Smartphone("AAA5", "SonyEricsson", 2500.00);
        Smartphone nokia = new Smartphone("AAA6", "Nokia", 1500.00);
        Smartphone nokia2 = new Smartphone("AAA6", "Nokia 2", 3000.00);
        Smartphone siemens = new Smartphone("AAA7", "Siemens", 2000.00);
        Smartphone iphonePro = new Smartphone("AAA8", "IPhone Pro", 12_000.00);

        smartphonesHashSet.add(iphone);
        smartphonesHashSet.add(iphonePro);
        smartphonesHashSet.add(xiaomi);
        smartphonesHashSet.add(sony);
        smartphonesHashSet.add(motorola);
        smartphonesHashSet.add(siemens);
        smartphonesHashSet.add(sonyEricsson);
        smartphonesHashSet.add(nokia);
        smartphonesHashSet.add(nokia2);

        for (Smartphone smartphone : smartphonesHashSet) {
            smartphonesTreeSet.add(smartphone);
        }
        smartphonesTreeSet.pollFirst();
        System.out.println(smartphonesTreeSet);

        smartphonesList.add(iphone);
        smartphonesList.add(iphonePro);
        smartphonesList.add(xiaomi);
        smartphonesList.add(sony);
        smartphonesList.add(motorola);
        smartphonesList.add(siemens);
        smartphonesList.add(sonyEricsson);
        smartphonesList.add(nokia);
        smartphonesList.add(nokia2);

        System.out.println(smartphonesTreeSet);
    }



}
