package study.viradonojiraya.day7.review.domain.employee;

import study.viradonojiraya.day7.review.domain.person.Person;

public abstract class Employee extends Person {
    protected boolean isActive;

    public Employee(String name, int age) {
        super(name, age);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
