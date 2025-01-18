package study.viradonojiraya.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static List<Manga> handleMangas() {
        Manga manga1 = new Manga(44, "Berserk", 19.99);
        Manga manga2 = new Manga(11, "Naruto", 12.99);
        Manga manga3 = new Manga(23, "One Piece", 10);

        List<Manga> mangas = new ArrayList<>();
        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);

        Collections.sort(mangas);

        return mangas;
    }

    public static List<Car> handleCars() {
        Car car1 = new Car(23);
        Car car2 = new Car(777);
        Car car3 = new Car(1 );

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars);

        return cars;
    }

    public static void main(String[] args) {
        System.out.println(handleMangas());

    }
}
