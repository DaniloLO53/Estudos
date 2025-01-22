package study.viradonojiraya._legacy.days.day6.review.domain;

import study.viradonojiraya._legacy.days.day6.review.domain.enums.ContractType;

public class Manager extends Employee {
    public static final ContractType contractType = ContractType.PF;
    private double hoursWorked;
    private double hourlyRate;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Manager(String name, int age, ContractType contractType) {
        this(name, age);
    }

    @Override
    protected double calculatePayment() {
        return this.hourlyRate * this.hoursWorked;
    }
}
