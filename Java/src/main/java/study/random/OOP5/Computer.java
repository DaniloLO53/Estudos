package study.random.OOP5;

public class Computer extends Product {
    private static final float TAX_FACTOR = 0.2f;

    public Computer(String title, float value) {
        super(title, value);
    }

    @Override
    public float calculateTax() {
        return this.value * TAX_FACTOR;
    }
}
