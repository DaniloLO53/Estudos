package study.random.OOP.OOP6;

public class Tomato extends Product {
    public static final double TAX_FACTOR = 0.05;
    private String expiryDate;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_FACTOR;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
