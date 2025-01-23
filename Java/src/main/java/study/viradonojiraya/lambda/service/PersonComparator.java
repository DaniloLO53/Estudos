package study.viradonojiraya.lambda.service;

import study.viradonojiraya.lambda.domain.Person;

public class PersonComparator {
    public static int compareByAge(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    public int compareByAgeNonStatic(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    public static int compareByName(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
