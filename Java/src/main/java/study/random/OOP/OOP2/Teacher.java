package study.random.OOP.OOP2;

public class Teacher {
     private String name;
     private Seminar[] seminars;

    public Teacher(String name) {
        this.name = name;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
