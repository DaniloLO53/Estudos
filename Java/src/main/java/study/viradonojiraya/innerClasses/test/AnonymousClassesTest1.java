package study.viradonojiraya.innerClasses.test;

import study.viradonojiraya.generics.domain.Boat;
import study.viradonojiraya.generics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest1 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Animal walking modified...");
            }

            // can't use outside
            public void jump() {
                System.out.println("Animal jumping...");
            }
        };

        List<Boat> boats = new ArrayList<>(List.of(new Boat("Costa"), new Boat("ASC")));
        List<Car> cars = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

        // two ways to compare
        // here, we add the Comparator implementation
        boats.sort(new BoatNameComparator());

        // here, we don't have any class implementation of comparator
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boats);
        System.out.println(cars);

//        animal.walk();
    }
}
