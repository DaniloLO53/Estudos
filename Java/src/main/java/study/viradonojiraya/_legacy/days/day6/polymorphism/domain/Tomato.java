package study.viradonojiraya._legacy.days.day6.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX = 0.05;
    private String expirationDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateTax() {
        return this.price * TAX;
    }
}
