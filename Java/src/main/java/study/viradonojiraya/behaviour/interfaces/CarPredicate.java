package study.viradonojiraya.behaviour.interfaces;

import study.viradonojiraya.behaviour.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
