package study.random.OOP5;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung", 10_000);
        Tomato tomato = new Tomato("Sicilian tomato", 10);

        System.out.println("--- Calculating tax ---");
        TaxCalculator.calculateComputerTax(computer);
        TaxCalculator.calculateTomatoTax(tomato);
        TaxCalculator.calculateTax(computer);
        TaxCalculator.calculateTax(tomato);
    }
}
