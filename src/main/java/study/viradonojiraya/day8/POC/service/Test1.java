package study.viradonojiraya.day8.POC.service;

import study.viradonojiraya.day8.POC.domain.Employee;
import study.viradonojiraya.day8.POC.domain.LoginInvalidException;
import study.viradonojiraya.day8.POC.domain.Person;

import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
