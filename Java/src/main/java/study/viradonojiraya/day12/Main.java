package study.viradonojiraya.day12;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("ABC12", "Mercedes");
        Car car2 = new Car("ABC12", "Audi");

        System.out.println(car1.equals(car2));
    }
}
