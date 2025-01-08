package study.viradonojiraya.day5.review;

public class Student extends Person {
    private College college;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, College college) {
        this(name, age);
        this.college = college;
    }

    @Override
    public void presentation() {
        super.presentation();
        System.out.println("College: " + (this.college != null ? this.college.getName() : "No college"));
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
