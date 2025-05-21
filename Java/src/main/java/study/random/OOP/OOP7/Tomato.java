package study.random.OOP.OOP7;

public class Tomato extends Product {
    public static final double TAX_FACTOR = 0.05;

    public Tomato(String name, double price) {
        super(name, price);
    }

    public double calculateTax() {
        return this.price * TAX_FACTOR;
    }
}
