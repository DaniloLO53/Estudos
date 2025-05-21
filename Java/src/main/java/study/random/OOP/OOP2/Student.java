package study.random.OOP.OOP2;

public class Student {
    private String name;
    private Seminar seminar;

    public Student(String name) {
        this.name = name;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
