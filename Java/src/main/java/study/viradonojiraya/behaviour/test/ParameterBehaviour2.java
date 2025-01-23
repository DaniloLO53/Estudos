package study.viradonojiraya.behaviour.test;

import study.viradonojiraya.behaviour.domain.Car;
import study.viradonojiraya.behaviour.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParameterBehaviour2 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("Blue", 1996), new Car("Green", 2020), new Car("Red", 2009)));

    public static void main(String[] args) {
        List<Car> cars1 = filterCarsPredicate(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2010;
            }
        });

        List<Integer> integersOver5 = filter(new ArrayList<>(List.of(1, 2, 3,4,5,6,7)), new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        });

        List<Car> cars2 = filterCarsPredicate(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        List<Car> cars3 = filterCarsPredicate(cars, car -> car.getColor().equals("Green"));

    }

    private static List<Car> filterCarsPredicate(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car: cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static <T> List<T> filter(List<T> objects, Predicate<T> objectPredicate) {
        List<T> filteredObjects = new ArrayList<>();

        for (T object: objects) {
            if (objectPredicate.test(object)) {
                filteredObjects.add(object);
            }
        }

        return filteredObjects;
    }
}



















