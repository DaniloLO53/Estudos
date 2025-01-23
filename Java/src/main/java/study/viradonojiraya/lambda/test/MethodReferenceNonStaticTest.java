package study.viradonojiraya.lambda.test;

import study.viradonojiraya.lambda.domain.Person;
import study.viradonojiraya.lambda.service.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceNonStaticTest {
    public static List<Person> people1 = new ArrayList<>(
            List.of(new Person("Danilo", 28),
                    new Person("Cássia", 27),
                    new Person("Eliane", 56)
            ));


    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();

        people1.sort((p1, p2) -> personComparator.compareByAgeNonStatic(p1, p2));

        System.out.println(people1);
    }
}
