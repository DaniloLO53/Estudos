package study.viradonojiraya.lambda.test;

import study.viradonojiraya.lambda.domain.Person;
import study.viradonojiraya.lambda.service.PersonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceStaticTest {
    public static List<Person> people1 = new ArrayList<>(
            List.of(new Person("Danilo", 28),
                    new Person("Cássia", 27),
                    new Person("Eliane", 56)
            ));

    public static void main(String[] args) {
        // Static methods reference
        Collections.sort(people1, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        Collections.sort(people1, PersonComparator::compareByAge);
        Collections.sort(people1, PersonComparator::compareByName);



        System.out.println(people1);
    }

}
