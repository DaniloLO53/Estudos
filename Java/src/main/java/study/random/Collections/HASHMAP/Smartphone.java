package study.random.Collections.HASHMAP;

import java.util.Objects;

public class Smartphone extends Product {
    public Smartphone(String serialNumber, String model, Double price) {
        super(serialNumber, model, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        return ((Smartphone) obj).getSerialNumber().equals(this.getSerialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
