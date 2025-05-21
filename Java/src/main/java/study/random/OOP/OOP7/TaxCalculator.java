package study.random.OOP.OOP7;

public class TaxCalculator {
    public static void calculate(Product product) {
        String name = product.getName();
        double tax = product.calculateTax();

        System.out.println("Name: " + name + " | " + "Tax: " + tax);

        if (product instanceof Tomato) System.out.println(((Tomato) product).getExpiryDate());
    }
}
