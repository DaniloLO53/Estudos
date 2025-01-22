package study.viradonojiraya._legacy.days.day13;

public class Car implements Comparable<Car> {
    private int serial;

    public Car(int serial) {
        this.serial = serial;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(serial, o.getSerial());
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
