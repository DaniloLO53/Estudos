package study.random.OOP.OOP6;

public class Computer extends Product {
    public static final double TAX_FACTOR = 0.1;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_FACTOR;
    }
}
