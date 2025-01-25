package domain;

import enums.Course;

public class Student extends Person {
    private Course course;
    private String semester = "\\d{4}\\.\\d";

    public Student(String name, String email) {
        super(name, email);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        if(semester.matches("\\d{4}\\.\\d")) throw new IllegalArgumentException("Value must be of type: dddd.d");
        this.semester = semester;
    }
}
