package study.viradonojiraya._legacy.days.day16.generics;

import java.util.List;

abstract class Animal {
    public abstract void appointment();
}

class Dog extends Animal {
    @Override
    public void appointment() {
        System.out.println("Consulting dog");
    }
}

class Cat extends Animal {
    @Override
    public void appointment() {
        System.out.println("Consulting cat");
    }
}

public class WildCardTest1 {
    public static void printAppointmentChild(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.appointment();
        }
    }

    public static void printAppointmentParent(List<? super Dog> animals) {
        for (Object o: animals) {
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        printAppointmentChild(dogs);
    }
}
