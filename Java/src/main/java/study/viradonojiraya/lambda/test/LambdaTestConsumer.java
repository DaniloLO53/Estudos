package study.viradonojiraya.lambda.test;

import study.viradonojiraya.lambda.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTestConsumer {
    public static List<Person> people1 = new ArrayList<>(List.of(new Person("Danilo", 28), new Person("Cássia", 27)));

    public static void main(String[] args) {
        printList(people1,person -> System.out.println(person.getName()));
    }

    public static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T e: list) {
            consumer.accept(e);
        }
    }


}
