package study.random.OOP.OOP3;

public abstract class Employee extends Person {
    protected float salary;

    public Employee(String name) {
        super(name);
    }

    public abstract float calculateBonus();

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
