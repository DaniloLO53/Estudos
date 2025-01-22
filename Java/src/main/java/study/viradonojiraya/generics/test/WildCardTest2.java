package study.viradonojiraya.generics.test;

import java.util.List;

public class WildCardTest2 {
    public static void printAppointment(List<Animal> animals) {
        for (Animal animal: animals) {
            animal.appointment();
        }
    }

    public static void printAppointmentWildCard(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.appointment();
        }

        // it's not allowed because the object passed as argument to "add" can be anything. To ensure the type
        // security, since the compiler doesn't know what type is being passed to the list, it's now allowed.
//        animals.add(new Dog());
    }

    public static void extendsWildcard(List<? extends Animal> animals) {
//        animals.add(new Dog());
    }

    public static void superWildcard(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }


    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

         // due to type erasure, JVM doesn't know that cat extends Animal (it only can see <Animal>)
//        printAppointment(cats);

//        printAppointmentWildCard(dogs); // it works due to wildcard
    }
}
