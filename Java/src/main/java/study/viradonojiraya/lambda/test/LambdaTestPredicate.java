package study.viradonojiraya.lambda.test;

import study.viradonojiraya.behaviour.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTestPredicate {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("Blue", 1996), new Car("Green", 2020), new Car("Red", 2009)));

    public static void main(String[] args) {
        List<Integer> integersOver5 = filter(new ArrayList<>(List.of(1, 2, 3,4,5,6,7)), integer -> integer > 5);
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



















