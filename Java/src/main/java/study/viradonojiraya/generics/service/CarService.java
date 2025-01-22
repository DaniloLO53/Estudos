package study.viradonojiraya.generics.service;

import study.viradonojiraya.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    Car car2 = new Car("BMW");
    Car car1 = new Car("Mercedes");
    private List<Car> availableCar = new ArrayList<>(List.of(car1, car2));

    public Car findAvailableCar() {
        System.out.println("Searching for available cars...");
        Car car = availableCar.remove(0);
        System.out.println("Car found: " + car);
        System.out.println("Available cars:");
        System.out.println(availableCar);
        return car;
    }

    public void returnRentedCar(Car car) {
        System.out.println("Returning car: " + car);
        availableCar.add(car);
        System.out.println("Available cars:");
        System.out.println(availableCar);
    }
}
