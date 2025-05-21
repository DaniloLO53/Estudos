package study.random.OOP.OOP6;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung", 3000);
        Tomato tomato = new Tomato("Sicilian tomato", 10);

        tomato.setExpiryDate("20/06/2025");

        TaxCalculator.calculateTax(computer);
        TaxCalculator.calculateTax(tomato);
    }
}
