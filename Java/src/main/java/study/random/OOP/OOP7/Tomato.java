package study.random.OOP.OOP7;

public class Tomato extends Product {
    public static final double TAX_FACTOR = 0.05;
    private String expiryDate;
    private final ProductType PRODUCT_TYPE = ProductType.ORGANIC;

    public Tomato(String name, double price) {
        super(name, price);
    }

    public double calculateTax() {
        return this.price * TAX_FACTOR;
    }

    public void showProductType() {
        PRODUCT_TYPE.showProductType();
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
