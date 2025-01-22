package study.viradonojiraya.generics.test;

abstract class Animal {
    public abstract void appointment();
}

class Dog extends Animal {
    @Override
    public void appointment() {
        System.out.println("Dog consulted...");
    }
}

class Cat extends Animal {
    @Override
    public void appointment() {
        System.out.println("Cat consulted...");
    }
}

public class GenericsTest1 {
    public static void printAppointment(Animal[] animals) {
        for (Animal animal: animals) {
            animal.appointment();
        }
        animals[0] = new Cat();
    }
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(), new Dog()};
        Cat[] cats = { new Cat(), new Cat()};

        printAppointment(dogs);
    }
}
