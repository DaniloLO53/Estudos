package study.random.OOP.OOP5;

public abstract class Product implements Taxable {
    protected String title;
    protected float value;

    public Product(String title, float value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public float getValue() {
        return value;
    }
}
