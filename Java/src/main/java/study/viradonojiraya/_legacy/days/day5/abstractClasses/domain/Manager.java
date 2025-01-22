package study.viradonojiraya._legacy.days.day5.abstractClasses.domain;

// As Manager extends the abstract class Employee, then Manager must fulfill the contract established
// by the abstract class. The contract is concreted by implementing the abstract methods
public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double EvaluateBonus() {
        return this.salary * 1.1;
    }
}
