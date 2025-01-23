package study.viradonojiraya.lambda.test;

import study.viradonojiraya.lambda.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTestFunction {
    public static List<Person> people1 = new ArrayList<>(List.of(new Person("Danilo", 28), new Person("Cássia", 27)));

    public static void main(String[] args) {
        List<Integer> namesLength = mapList(people1, person -> person.getName().length());
        List<String> names = mapList(people1, Person::getName);
        System.out.println(namesLength);
    }

    private static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();

        for (T e: list) {
            R r = function.apply(e);
            mappedList.add(r);
        }

        return mappedList;
    }
}
