package study.viradonojiraya.day4.video70.domain;

public class Seminar {
    private String title;
    private Place place;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
