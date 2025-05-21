package study.random.OOP.OOP4;

public class Manager implements Employee {
    String name;
    float salary;

    @Override
    public void presentation() {
        System.out.println("Hi, my name is " + this.name);
    }

    @Override
    public float calculateBonus() {
        return this.salary * 0.1f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
