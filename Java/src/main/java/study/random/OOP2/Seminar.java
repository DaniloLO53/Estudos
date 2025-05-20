package study.random.OOP2;

public class Seminar {
     private String title;
     private Student[] students;
     private Place place;

    public Seminar(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
