package study.viradonojiraya._legacy.days.review.domain.employee;

public class Manager extends Employee {
    private double salary;

    public Manager(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void report() {
        System.out.printf("""
                Name: %s
                Salary: %f
                """, this.name, this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
