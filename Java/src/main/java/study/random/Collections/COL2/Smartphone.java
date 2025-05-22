package study.random.Collections.COL2;

import java.util.Objects;

public class Smartphone implements Comparable<Smartphone> {
    private String serialNumber;
    private String model;
    private String memory;
    private Double price;

    public Smartphone(String serialNumber, String model, String memory, Double price) {
        Objects.requireNonNull(serialNumber, "Serial Number can't be null");
        Objects.requireNonNull(model, "Model can't be null");

        this.serialNumber = serialNumber;
        this.model = model;
        this.memory = memory;
        this.price = price;
    }

    @Override
    public int compareTo(Smartphone smartphone) {
        return this.model.compareTo(smartphone.model);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (object.getClass() != this.getClass()) return false;
        return this.serialNumber != null && ((Smartphone) object).serialNumber.equals(this.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = serialNumber.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + memory.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Serial Number: " + this.serialNumber + " | " + "Model: " + this.model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
