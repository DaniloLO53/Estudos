package study.random.Collections.LIST;

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

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(iphone);
        smartphones.add(xiaomi);
        smartphones.add(sony);
        smartphones.add(motorola);
        smartphones.add(sonyEricsson);
        smartphones.add(nokia);

        Computer samsung = new Computer("AAB1", "Samsung", 4500.00);
        Computer acer = new Computer("AAB2", "Acer", 3000.00);
        Computer alienWare = new Computer("AAB3", "AlienWare", 12_000.00);
        Computer macBook = new Computer("AAB4", "MacBook", 20_000.00);
        Computer dell = new Computer("AAB5", "Dell", 4500.00);

        List<Computer> computers = new ArrayList<>();
        computers.add(samsung);
        computers.add(acer);
        computers.add(alienWare);
        computers.add(macBook);
        computers.add(dell);

//        Collections.sort(smartphones, new SmartphoneComparatorByModel());
        smartphones.sort(new SmartphoneComparatorByModel());
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone.getModel());
        }

        System.out.println("---------------------------------------------------------");

        Collections.sort(computers);
        for (Computer computer : computers) {
            System.out.println(computer.getModel());
        }

        System.out.println("---------------------------------------------------------");

        Smartphone smartphoneToSearch = nokia;
        Integer indexOfSmartphone = Collections.binarySearch(smartphones, smartphoneToSearch, new SmartphoneComparatorByModel());

        Computer computerToSearch = acer;
        Integer indexOfComputer = Collections.binarySearch(computers, computerToSearch);

        System.out.println("Index of " + smartphoneToSearch.getModel() + ": " + indexOfSmartphone);
        System.out.println("Index of " + computerToSearch.getModel() + ": " + indexOfComputer);

        Iterator<Computer> computerIterator = computers.iterator();
        while (computerIterator.hasNext()) {
            if (computerIterator.next().getPrice() > 10_000.00) {
                computerIterator.remove();
            }
        }

        System.out.println(computers);
    }
}
