package study.random.Collections.HASHMAP;

import java.util.*;

class SmartphoneComparatorByPrice implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("AAA1", "IPhone 15", 10_000.00);
        Smartphone xiaomi = new Smartphone("AAA2", "Xiaomi", 8000.00);
        Smartphone sony = new Smartphone("AAA3", "Sony", 4000.00);
        Smartphone motorola = new Smartphone("AAA4", "Motorola", 3000.00);
        Smartphone sonyEricsson = new Smartphone("AAA5", "SonyEricsson", 2500.00);
        Smartphone nokia = new Smartphone("AAA6", "Nokia", 1500.00);
        Smartphone nokia2 = new Smartphone("AAA6", "Nokia 2", 3000.00);
        Smartphone siemens = new Smartphone("AAA7", "Siemens", 2000.00);
        Smartphone iphonePro = new Smartphone("AAA8", "IPhone Pro", 12_000.00);

        Map<String, Smartphone> smartphoneHashMap = new HashMap<>();
        smartphoneHashMap.put("A", iphone);
        smartphoneHashMap.put("B", iphonePro);
        smartphoneHashMap.put("C", xiaomi);

        for (String key : smartphoneHashMap.keySet()) {
            System.out.println(key + ": " + smartphoneHashMap.get(key));
        }

        System.out.println(rateSmartphones(iphone, xiaomi, sony, sonyEricsson, nokia, motorola, iphonePro, nokia2, siemens));
    }

    public static Map<String, List<Smartphone>> rateSmartphones(Smartphone ...smartphones) {
        Map<String, List<Smartphone>> smartphonePriceRate = new HashMap<>();
        List<Smartphone> cheapSmartphones = new ArrayList<>();
        List<Smartphone> fairSmartphones = new ArrayList<>();
        List<Smartphone> expansiveSmartphones = new ArrayList<>();

        for (Smartphone smartphone : smartphones) {
            if (smartphone.getPrice() <= 2500) {
                cheapSmartphones.add(smartphone);
            } else if (smartphone.getPrice() <= 6000) {
                fairSmartphones.add(smartphone);
            } else {
                expansiveSmartphones.add(smartphone);
            }
        }

        smartphonePriceRate.put("Cheap", cheapSmartphones);
        smartphonePriceRate.put("Fair", fairSmartphones);
        smartphonePriceRate.put("Expansive", expansiveSmartphones);

        return smartphonePriceRate;
    }
}
