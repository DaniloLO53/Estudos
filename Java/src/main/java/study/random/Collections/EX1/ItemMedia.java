package study.random.Collections.EX1;

public abstract class ItemMedia {
    protected String name;
    protected Double price;

    public ItemMedia(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Name: " + this.name + " | Price: " + this.price);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemMedia{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
