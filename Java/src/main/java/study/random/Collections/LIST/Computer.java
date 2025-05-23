package study.random.Collections.LIST;

public class Computer extends Product implements Comparable<Computer> {
    public Computer(String serialNumber, String model, Double price) {
        super(serialNumber, model, price);
    }

    @Override
    public int compareTo(Computer o) {
        return this.model.compareTo(o.model);
    }
}
