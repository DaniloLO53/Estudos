package study.random.OOP.OOP7;

public interface Taxable {
    String HEADER = "This product will be taxed.";

    double calculateTax();

    default void presentation() {
        System.out.println(HEADER);
    }
}
