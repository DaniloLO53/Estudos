package study.viradonojiraya._legacy.days.day3.test;

// ************* SHORTCUTS *************
// CTRL + SHIFT + F10: Compile and execute

import study.viradonojiraya._legacy.days.day3.domain.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Danilo");
        person.setAge(28);

        person.presentation();
    }
}
