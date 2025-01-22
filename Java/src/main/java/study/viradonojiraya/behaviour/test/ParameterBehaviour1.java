package study.viradonojiraya.behaviour.test;

import study.viradonojiraya.behaviour.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ParameterBehaviour1 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("Blue", 1996), new Car("Green", 2020), new Car("Red", 2009)));

    public static void main(String[] args) {
        System.out.println(filterCarsByColor(cars, "Red"));
    }

    private static List<Car> filterCarsByYear(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car: cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car: cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
