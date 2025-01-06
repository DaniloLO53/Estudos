package study.viradonojiraya.day3.test.staticModifiersTest;

import study.viradonojiraya.day3.domain.staticModifiers.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 300);
        Car car3 = new Car("Audi", 260);

        // since speedLimit is static, it's not related to a specific object anymore
        // the static modifier disassociate the attribute from the class instance
        // now the attributes belongs to the class
        // so that the setSpeedLimit is evaluated for the class itself, not for its instances
        car1.setSpeedLimit(255);
        System.out.println(car2.getSpeedLimit()); // speedLimit car1, car2 and car3 are modified to 255

        // it makes more sense to modify through the class, not the instance
        Car.setSpeedLimit(180);
        System.out.println(Car.getSpeedLimit()); // speedLimit car1, car2 and car3 are modified to 180
    }
}
