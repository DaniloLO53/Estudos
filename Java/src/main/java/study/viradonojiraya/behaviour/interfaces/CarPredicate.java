package study.viradonojiraya.behaviour.interfaces;

import study.viradonojiraya.behaviour.domain.Car;

// functional interface: it has only one abstract method
public interface CarPredicate {
    boolean test(Car car);
}
