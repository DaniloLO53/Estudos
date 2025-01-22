package study.viradonojiraya._legacy.days.day4.domain;

public class Team {
    private String name;
    private Teacher[] teachers;

    public Team(String name) {
        this.name = name;
    }
    public Team(String name, Teacher[] teachers) {
        this(name);
        this.teachers = teachers;
    }

    public void presentation() {
        System.out.println(this.name);
        for(Teacher teacher: this.teachers) {
            System.out.println(teacher.getName());
        }
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
