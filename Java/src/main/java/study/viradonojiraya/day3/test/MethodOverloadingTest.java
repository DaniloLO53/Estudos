package study.viradonojiraya.day3.test;

import study.viradonojiraya.day3.domain.MethodOverloading;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.init("Danilo", 33);
        methodOverloading.init('F');

        methodOverloading.presentation();
    }
}
