package study.viradonojiraya.lambda.test;

import study.viradonojiraya.lambda.domain.Person;
import study.viradonojiraya.lambda.service.PersonComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceConstructorTest {
    public static List<Person> people1 = new ArrayList<>(
            List.of(new Person("Danilo", 28),
                    new Person("Cássia", 27),
                    new Person("Eliane", 56)
            ));
    public static List<String> names = new ArrayList<>(List.of("Danilo", "Cássia", "Eliane"));


    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();

        names.sort(String::compareTo);
        Function<String, Integer> numStringToInteger = Integer::parseInt;

        System.out.println(numStringToInteger.apply("20"));
        System.out.println(people1);
    }
}
