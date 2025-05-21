package study.random.OOP.OOP7;

public class Computer extends Product {
    public static final double TAX_FACTOR = 0.1;

    public Computer(String name, double price) {
        super(name, price);
    }

    public double calculateTax() {
        return this.price * TAX_FACTOR;
    }
}
