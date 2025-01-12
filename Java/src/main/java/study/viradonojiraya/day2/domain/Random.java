package study.viradonojiraya.day2.domain;

public class Random {
    public int sum(int a, int b) {
        return a + b;
    }

    public void modifyNumberTo0(int n) {
        n = 0;
    }

    public void modifyPersonToDefault(Person person) {
        person.name = "Default";
        person.age = 99;
        person.gender = 'M';
    }
}
