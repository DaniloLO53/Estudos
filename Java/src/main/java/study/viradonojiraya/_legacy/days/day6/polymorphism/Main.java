package study.viradonojiraya._legacy.days.day6.polymorphism;

import study.viradonojiraya._legacy.days.day6.polymorphism.application.TaxCalculator;
import study.viradonojiraya._legacy.days.day6.polymorphism.domain.Computer;
import study.viradonojiraya._legacy.days.day6.polymorphism.domain.Product;
import study.viradonojiraya._legacy.days.day6.polymorphism.domain.Tomato;

public class Main {
    public static void main(String[] args) {
        Product computer = new Computer("Dell 5050s", 3400.99);
        Product tomato1 = new Tomato("Tomato 1kg", 0.56);
        Tomato tomato2 = new Tomato("American Tomato", 1.56);

        tomato2.setExpirationDate("11/02/2025");

        TaxCalculator.calculateProductTax(tomato2);
    }
}
