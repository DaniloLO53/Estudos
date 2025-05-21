package study.random.OOP.OOP6;

public class TaxCalculator {
    public static void calculateTax(Product product) {
        double tax = product.calculateTax();
        System.out.println("Tax: " + tax);

        if (product instanceof Tomato) {
            System.out.println("Expiration date: " + ((Tomato) product).getExpiryDate());
        }
    }
}
