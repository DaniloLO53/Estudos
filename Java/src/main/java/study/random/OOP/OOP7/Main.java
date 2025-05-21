package study.random.OOP.OOP7;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung", 4000);
        Tomato tomato = new Tomato("Sicilian tomato", 10);

        tomato.setExpiryDate("20/07/2025");

        TaxCalculator.calculate(computer);

        computer.showProductType();
    }
}
