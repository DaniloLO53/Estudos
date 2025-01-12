package study.viradonojiraya.day4.heritance.application;

import study.viradonojiraya.day4.heritance.domain.Address;
import study.viradonojiraya.day4.heritance.domain.Employee;
import study.viradonojiraya.day4.heritance.domain.Person;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Rua Miguel Ângelo");
        Person person = new Person("Danilo", 28);
        Employee employee = new Employee("Cássia", 27, 3000);

        employee.presentation();
    }
}
