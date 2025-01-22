package study.viradonojiraya._legacy.days.day5.finalModifier.application;

import study.viradonojiraya._legacy.days.day5.finalModifier.domain.Buyer;
import study.viradonojiraya._legacy.days.day5.finalModifier.domain.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer buyer = new Buyer("Dan", 28);

        // we can't reassign a new reference to a "final" object, but we can access its methods and
        // change things like the age of the "final" reference
        car.BUYER.setAge(30);

        System.out.println(car.BUYER);
    }
}
