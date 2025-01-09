package study.viradonojiraya.day6.polymorphism.domain;

public class Computer extends Product {
    public static final double TAX = 0.25;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX;
    }
}
