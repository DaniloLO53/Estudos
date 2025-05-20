package study.random.OOP5;

public class TaxCalculator {
    public static void calculateComputerTax(Computer computer) {
        float tax = computer.calculateTax();
        System.out.println("Title: " + computer.getTitle() + " | " + "Tax: " + tax);
    }

    public static void calculateTomatoTax(Tomato tomato) {
        float tax = tomato.calculateTax();
        System.out.println("Title: " + tomato.getTitle() + " | " + "Tax: " + tax);
    }

    public static void calculateTax(Product product) {
        float tax = product.calculateTax();
        System.out.println("Title: " + product.getTitle() + " | " + "Tax: " + tax);
    }
}
