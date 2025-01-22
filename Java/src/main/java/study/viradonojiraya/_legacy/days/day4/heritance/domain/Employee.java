package study.viradonojiraya._legacy.days.day4.heritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age); // the superclass (parent class) constructor
        this.salary = salary;
    }

    @Override // it's not necessary, but it helps to avoid typos in the method's name
    public void presentation() {
        super.presentation();
        System.out.println("Salary: " + this.salary);
    }

    public void generateReport() {
        System.out.printf("""
                Employee %s
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
