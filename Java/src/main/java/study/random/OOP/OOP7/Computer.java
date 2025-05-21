package study.random.OOP.OOP7;

public class Computer extends Product {
    public static final double TAX_FACTOR = 0.1;
    private final ProductType PRODUCT_TYPE = ProductType.ELECTRONIC;

    public Computer(String name, double price) {
        super(name, price);
    }

    public void showProductType() {
        PRODUCT_TYPE.showProductType();
    }

    public double calculateTax() {
        return this.price * TAX_FACTOR;
    }
}
