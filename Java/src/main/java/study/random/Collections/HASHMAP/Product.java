package study.random.Collections.HASHMAP;

public abstract class Product {
    protected String serialNumber;
    protected String model;
    protected Double price;

    public Product(String serialNumber, String model, Double price) {
        this.serialNumber = serialNumber;
        this.model = model;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
