package study.viradonojiraya.day5.abstractClasses.domain;

// we cannot use "final" keyword, as it prevents the class from being extended
public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // The access modifier of the super class method can be more restricted than the subclass, but the opposite is false
    // The access modifier of the super class method must be on the same level or below of the subclass one
    // That's because if, for example, the super class method is protected and the subclass is public, all classes
    // can access the protected method, since it's public. On the other hand, if super class method is protected and
    // the subclass is private, there would be classes that should get access to the method, but they can't, due to
    // the restriction imposed by the subclass
    protected abstract double EvaluateBonus();
}
