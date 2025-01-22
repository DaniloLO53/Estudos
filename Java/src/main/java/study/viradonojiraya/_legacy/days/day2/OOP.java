package study.viradonojiraya._legacy.days.day2;

import study.viradonojiraya._legacy.days.day2.domain.Person;
import study.viradonojiraya._legacy.days.day2.domain.Random;

public class OOP {
    public static void main(String[] args) {
        Random calculator = new Random();
        Person person = new Person();
        Person personCopy = person;
        int a = 1;

        System.out.println("personcopy name before person is modified: " + personCopy.name);

        // primitive types are passed by value, not by reference
        // then the value passed is a copy
        // then the value is not modified
        calculator.modifyNumberTo0(a);
        System.out.println(a); // not modified

        // objects are passed by reference, not by value
        // then the reference of the objects is passed
        // then objects are in fact modified
        calculator.modifyPersonToDefault(person);
        System.out.println(person.name); // modified

        System.out.println("personcopy name after person is modified: " + personCopy.name);
        System.out.println(465 / 60);
    }
}
