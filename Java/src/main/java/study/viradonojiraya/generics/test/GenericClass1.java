package study.viradonojiraya.generics.test;

import study.viradonojiraya.generics.domain.Boat;
import study.viradonojiraya.generics.domain.Car;
import study.viradonojiraya.generics.service.CarService;
import study.viradonojiraya.generics.service.GenericService;

import java.util.ArrayList;
import java.util.List;

public class GenericClass1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("BMW"), new Car("Mercedes")));
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Barco"), new Boat("Navio")));

        GenericService<Car> genericServiceCar = new GenericService<>(cars);
        GenericService<Boat> genericServiceBoats = new GenericService<>(boats);

//        genericServiceCar.findAvailableProduct();
        genericServiceBoats.findAvailableProduct();
    }
}
