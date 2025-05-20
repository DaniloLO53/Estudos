package study.random.OOP5;

public class Tomato extends Product {
    private static final float TAX_FACTOR = 0.05f;
    private String expiryDate;

    public Tomato(String title, float value) {
        super(title, value);
    }

    @Override
    public float calculateTax() {
        return this.value * TAX_FACTOR;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
