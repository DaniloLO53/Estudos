package study.viradonojiraya.day6.review.domain;

public abstract class Employee {
    protected String name;
    protected int age;

    protected abstract double calculatePayment();

    public void displayInfo() {
        System.out.printf("""
                Name: %s
                Salary: %f
                """, this.name, this.calculatePayment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
